package com.revature.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.DAOimp.EmployeeDAOImp;
import com.revature.DAOimp.TR_FormDAOImp;
import com.revature.objects.Employee;
import com.revature.objects.TR_Form;

/**
 * Servlet implementation class AJAXServlet
 */
public class AJAXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AJAXServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodRequest = request.getParameter("methodRequest");

		if (methodRequest.equals("getUserInfo")) {
			Employee e = getUserInfo(request);

			ObjectMapper mapper = new ObjectMapper();

			mapper.writeValue(new File("user.json"), e);

			String jsonInString = mapper.writeValueAsString(e);
			
//			System.out.println("jason is " + jsonInString);
			
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();

			out.print(jsonInString);
			out.flush();
		}
		if (methodRequest.equals("getAllTRByUser")) {

			HttpSession session = (HttpSession) request.getSession();
			Employee currentEmployee = (Employee) session.getAttribute("user");

			String userid = currentEmployee.getEMPLOYEE_ID().toString();

			List<TR_Form> trlist = new ArrayList<>();
			TR_FormDAOImp trdao = new TR_FormDAOImp();
			trlist = trdao.getAllTR_FormsByUserId(userid);

			ObjectMapper mapper = new ObjectMapper();

			mapper.writeValue(new File("user.json"), trlist);

			String jsonInString = mapper.writeValueAsString(trlist);

//			System.out.println("jason is " + jsonInString);

			response.setContentType("application/json");
			PrintWriter out = response.getWriter();

			out.print(jsonInString);
			out.flush();
		}
		if (methodRequest.equals("getSupervisor")) {

			String id = request.getParameter("supId");
			System.out.println("supervisor id " + id);
			EmployeeDAOImp empDao = new EmployeeDAOImp();
			
			Employee supervisor = empDao.getEmployee(id);

			ObjectMapper mapper = new ObjectMapper();

			mapper.writeValue(new File("user.json"), supervisor);

			String jsonInString = mapper.writeValueAsString(supervisor);

//			System.out.println("jason is " + jsonInString);

			response.setContentType("application/json");
			PrintWriter out = response.getWriter();

			out.print(jsonInString);
			out.flush();
		}
		if(methodRequest.equals("setTRdeleted")) {
			String trid = request.getParameter("trID");
			TR_FormDAOImp trdao = new TR_FormDAOImp();
			trdao.setTRStatusDeleted(trid);
		}

	}

	private Employee getUserInfo(HttpServletRequest request) {

		HttpSession session = (HttpSession) request.getSession();

		Employee currentEmployee = (Employee) session.getAttribute("user");
		currentEmployee.setPASS_WORD("");// Security purposes. Clear before sending to client

		return currentEmployee;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

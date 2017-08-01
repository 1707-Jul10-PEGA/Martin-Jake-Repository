package com.revature.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.objects.Employee;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodRequest = request.getParameter("methodRequest");
				
		if(methodRequest.equals("getUserInfo")) {
			Employee e = getUserInfo(request);
			
			ObjectMapper mapper = new ObjectMapper();
			
			mapper.writeValue(new File("user.json"), e);
			
			String jsonInString = mapper.writeValueAsString(e);
			
			System.out.println("jason is " + jsonInString);

			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			
			out.print(jsonInString);
			out.flush();
			
			
				
		}
		else
		System.out.println("Nothing");
		
	}

	
	private Employee getUserInfo(HttpServletRequest request) {
		
		HttpSession session = (HttpSession) request.getSession();
		
		Employee currentEmployee = (Employee) session.getAttribute("user");
		currentEmployee.setPASS_WORD("");//Security purposes. Clear before sending to client
				
		return currentEmployee;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

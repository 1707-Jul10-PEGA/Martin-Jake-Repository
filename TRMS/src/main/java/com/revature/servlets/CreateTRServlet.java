package com.revature.servlets;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.objects.Event;
import com.revature.objects.Reimbursement;
import com.revature.objects.TR_Form;

/**
 * Servlet implementation class CreateTRServlet
 */
public class CreateTRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateTRServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		System.out.println("Inside create new tr");
//		
//		TR_Form tr = new TR_Form();
//		tr.setTR_ID(UUID.randomUUID().toString());
//		tr.setEMPLOYEE_ID(request.getParameter("employeeID"));
//		tr.setDATE_CREATED(request.getParameter("requestdate"));
//		tr.setREQUIRES_MORE_INFO(0);
//		tr.setAPPROVAL_STATUS(1);
//		
//		Reimbursement reim = new Reimbursement();
//		reim.setREIMBURSEMENT_ID(UUID.randomUUID().toString());
//		reim.setREIMBURSEMENT_REQUESTED(Double.parseDouble(request.getParameter("eventcost")));
//		reim.setFINAL_REIMBURSEMENT_AMOUNT(0);
//		
//		Event event = new Event();
//		event.setEVENT_ID(UUID.randomUUID().toString());
//		event.setSTART_DATE(request.getParameter("eventbegindate"));
//		event.setLOCATION(request.getParameter("eventlocation"));
//		event.setDESCRIPTION(request.getParameter("eventdescription"));
//		event.setGRADING_REQUIRED(1);
//		event.setEND_DATE(request.getParameter("eventenddate"));
//		
//		int reimbursementType = 0;
//		if (request.getParameter("eventtype").equals("unicourse")) {
//			reimbursementType = 1;
//		}
//		if (request.getParameter("eventtype").equals("seminar")) {
//			reimbursementType = 2;
//		}
//		if (request.getParameter("eventtype").equals("cpc")) {
//			reimbursementType = 3;
//		}
//		if (request.getParameter("eventtype").equals("cert")) {
//			reimbursementType = 4;
//		}
//		if (request.getParameter("eventtype").equals("tech")) {
//			reimbursementType = 5;
//		}
//		if(request.getParameter("eventtype").equals("other")) {
//			reimbursementType = 6;
//		}
//		
//		reim.setREIMBURSEMENT_TYPE_ID(reimbursementType);
//		
//		tr.setEMPLOYEE_ID(event.getEVENT_ID());
//		tr.setREIMBURSEMENT_ID(reim.getREIMBURSEMENT_ID());
//		
//		System.out.println(tr);
//		System.out.println(reim);
//		System.out.println(event);
//		
//		
		
		
		
	}

}

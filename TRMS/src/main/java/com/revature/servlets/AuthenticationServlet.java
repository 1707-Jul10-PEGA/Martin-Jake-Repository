package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.auth.AuthenticateEmployee;
import com.revature.objects.Employee;

/**
 * Servlet implementation class AuthenticationServlet
 */
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthenticationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Authenticates user by checking its credentials against the database.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Employee employee = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		AuthenticateEmployee auth = new AuthenticateEmployee();
		employee = auth.authenticateUser(username, password);

		if (employee != null) {

			/* Create a new session */
			HttpSession session = request.getSession(true);
			session.setAttribute("user", employee);
			response.sendRedirect("dashboard");
		} else {
			System.out.println("Incorrect credentials");
			request.getRequestDispatcher("login.html").forward(request, response);
		}

	}

}

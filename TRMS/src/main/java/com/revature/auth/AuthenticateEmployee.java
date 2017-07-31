package com.revature.auth;

import com.revature.DAOimp.EmployeeDAOImp;
import com.revature.objects.Employee;

public class AuthenticateEmployee {
	EmployeeDAOImp empDao = new EmployeeDAOImp();
	
	
	public boolean authenticateUser(String username, String password) {
		
		if(username.equals("mdelira")) {
			if(password.equals("lv223")) {
				return true;
			}
		}
			
		return false;
	}

}

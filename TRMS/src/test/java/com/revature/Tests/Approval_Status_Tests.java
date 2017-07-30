package com.revature.Tests;

import com.revature.DAOimp.Approval_StatusDAOImp;
import com.revature.objects.Approval_Status;

public class Approval_Status_Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Approval_StatusDAOImp as = new Approval_StatusDAOImp();
		
		//Test method 1 SUCCESS
//		for(Approval_Status x: as.getAllApproval_Status()){
//			System.out.println(x.toString());
//		}
		
		//Test method 2 SUCCESS
		//System.out.println(as.getApproval_Status("3").toString());
		
		
		//Test Method 3 SUCCESS
//		Approval_Status x = new Approval_Status(3,"DH APPROVED");
//		as.updateApproval_Status("3", x);
		
		
		//Test Method 4 - NOT IMPLEMENTED, SKIP
		
		//Test Method 5 - SUCCESS
//		Approval_Status x2 = new Approval_Status(7,"ADDED FAKE STATUS");
//		as.addApproval_Status(x2);
		
		
		
	}

}

package com.revature.Tests;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAOimp.ReimbursementDAOImp;
import com.revature.DAOimp.Reimbursement_TypeDAOImp;
import com.revature.objects.Reimbursement;

public class ReimbursementTester {

	public static void main(String[] args) throws SQLException {
		
		ReimbursementDAOImp dao = new ReimbursementDAOImp();
		
		List<Reimbursement> reimbursementList = new ArrayList<>();
		
		/*getAllReimbursement TEST*/ /*PASSED*/
//		reimbursementList = dao.getAllReimbursements();
//		System.out.println(reimbursementList);

		/*getReimbursement TEST*/ /*PASSED*/
//		System.out.println(dao.getReimbursement("c45072bb-eae4-420d-b864-b34527be0204"));
		
		/*addReimbursement TEST*/ /*PASSED*/
//		Reimbursement r = new Reimbursement ("qsda", 1, 10, 10, "cuz i want moreee");
//		dao.addReimbursement(r);
		
		/*Update tester*//*PASSED*/
//		dao.updateReimbursement("qsda", r);
//		System.out.println(dao.getAllReimbursements());
		
		
	}
	;
}

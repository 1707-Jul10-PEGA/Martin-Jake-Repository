package com.revature.DAO;

import java.util.List;

import com.revature.objects.Reimbursement;

public interface ReimbursementDAO {

	public List<Reimbursement> getAllReimbursements();	
	
	public Reimbursement getReimbursement(String rid);
	
	public void addReimbursement(Reimbursement rt);
	
	public void updateReimbursement(String rtID);
	
	public void deleteReimbursement(String rtID);
	
		
	
	
}

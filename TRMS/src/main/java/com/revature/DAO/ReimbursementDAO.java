package com.revature.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.objects.Reimbursement;

public interface ReimbursementDAO {

	public List<Reimbursement> getAllReimbursements() throws SQLException;	
	
	public Reimbursement getReimbursement(String rid) throws SQLException;
	
	public void addReimbursement(Reimbursement rt) throws SQLException;
	
	public void updateReimbursement(String rtID, Reimbursement reimbursement) throws SQLException;
	
	public void deleteReimbursement(String rtID);
	
		
	
	
}

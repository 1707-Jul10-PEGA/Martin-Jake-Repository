package com.revature.DAO;

import java.util.List;

import com.revature.objects.Reimbursement_Type;

public interface Reimbursement_TypeDAO {


	public List<Reimbursement_Type> getAllReimbursement_Types();	
	
	public Reimbursement_Type getReimbursement_Type(String rtid);
	
	public void addReimbursement_Type(Reimbursement_Type rt);
	
	public void updateReimbursement_Type(String rtID, Reimbursement_Type e);
	
	public void deleteReimbursement_Type(String rtID);
	
	
}

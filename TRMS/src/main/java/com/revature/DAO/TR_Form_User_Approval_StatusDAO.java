package com.revature.DAO;

import java.util.List;

import com.revature.objects.TR_Form_User_Approval_Status;

public interface TR_Form_User_Approval_StatusDAO {

	public List<TR_Form_User_Approval_Status> getAllTUAS();	
	
	public TR_Form_User_Approval_Status getTUAS(String tid);
	
	public void addTUAS(TR_Form_User_Approval_Status t);
	
	public void updateTUAS(String tID);
	
	public void deleteTUAS(String tID);
	

	
}

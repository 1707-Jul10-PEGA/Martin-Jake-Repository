package com.revature.DAO;

import java.util.List;

import com.revature.objects.Approval_Status;
import com.revature.objects.Event;

public interface Approval_StatusDAO {

	public List<Approval_StatusDAO> getAllApproval_Status();

	public Approval_Status getApproval_Status(String AStid);

	public void addApproval_Status(Approval_StatusDAO as);

	public void updateApproval_Status(String ASID);

	public void deleteApproval_Status(String ASID);
	
}

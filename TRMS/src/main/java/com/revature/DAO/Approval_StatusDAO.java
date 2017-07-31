package com.revature.DAO;

import java.util.List;

import com.revature.objects.Approval_Status;
import com.revature.objects.Event;

public interface Approval_StatusDAO {

	public List<Approval_Status> getAllApproval_Status();

	public Approval_Status getApproval_Status(String AStid);

	public void addApproval_Status(Approval_Status as);

	public void updateApproval_Status(String ASID, Approval_Status AS);

	public void deleteApproval_Status(String ASID);
	
}

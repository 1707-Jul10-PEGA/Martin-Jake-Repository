package com.revature.DAO;

import java.util.List;

import com.revature.objects.Event;

public interface Approver_StatusDAO {

	public List<Approver_StatusDAO> getAllApprover_Status();

	public Event getApprover_Status(String AStid);

	public void addApprover_Status(Approver_StatusDAO as);

	public void updateApprover_Status(String ASID);

	public void deleteApprover_Status(String ASID);
	
}

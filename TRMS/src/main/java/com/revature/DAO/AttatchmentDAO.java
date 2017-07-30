package com.revature.DAO;

import java.util.List;

import com.revature.objects.Attatchment;

public interface AttatchmentDAO {

	public List<Attatchment> getAllAttatchment();

	public Attatchment getAttatchment(String Attatchmentid);

	public void addAttatchment(Attatchment a);

	public void updateAttatchment(String AttatchmentID, Attatchment att);

	public void deleteAttatchment(String AttatchmentID);
	
}

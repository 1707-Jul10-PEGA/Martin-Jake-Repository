package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.AttatchmentDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Attatchment;

public class AttatchmentDAOImp implements AttatchmentDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}
	
	public AttatchmentDAOImp() {
		super();
		setup();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Attatchment> getAllAttatchment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attatchment getAttatchment(String Attatchmentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAttatchment(Attatchment a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAttatchment(String AttatchmentID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAttatchment(String AttatchmentID) {
		// TODO Auto-generated method stub

	}

}

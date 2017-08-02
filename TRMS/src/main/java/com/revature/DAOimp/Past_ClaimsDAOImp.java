package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.Past_ClaimsDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Past_Claims;

public class Past_ClaimsDAOImp implements Past_ClaimsDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public Past_ClaimsDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Past_Claims> getAllPast_Claims() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Past_Claims getPast_Claims(String PCid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPast_Claims(Past_Claims pc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePast_Claims(String pcID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePast_Claims(String pcID) {
		// TODO Auto-generated method stub

	}

}

package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.LogDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Log;

public class LogDAOImp implements LogDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public LogDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Log> getAllLogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Log getLog(String logid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLog(Log l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLog(String logID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLog(String logID) {
		// TODO Auto-generated method stub

	}

}

package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.TR_Form_User_Approval_StatusDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.TR_Form_User_Approval_Status;

public class TR_Form_User_Approval_StatusDAOImp implements TR_Form_User_Approval_StatusDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public TR_Form_User_Approval_StatusDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<TR_Form_User_Approval_Status> getAllTUAS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR_Form_User_Approval_Status getTUAS(String tid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTUAS(TR_Form_User_Approval_Status t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTUAS(String tID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTUAS(String tID) {
		// TODO Auto-generated method stub

	}

}

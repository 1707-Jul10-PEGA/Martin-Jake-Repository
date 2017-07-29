package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.Reimbursement_TypeDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Reimbursement_Type;

public class Reimbursement_TypeDAOImp implements Reimbursement_TypeDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public Reimbursement_TypeDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Reimbursement_Type> getAllReimbursement_Types() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement_Type getReimbursement_Type(String rtid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addReimbursement_Type(Reimbursement_Type rt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateReimbursement_Type(String rtID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReimbursement_Type(String rtID) {
		// TODO Auto-generated method stub

	}

}

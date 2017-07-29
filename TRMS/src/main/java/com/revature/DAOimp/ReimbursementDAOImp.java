package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.ReimbursementDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Reimbursement;

public class ReimbursementDAOImp implements ReimbursementDAO {

	
	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public ReimbursementDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Reimbursement> getAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement getReimbursement(String rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addReimbursement(Reimbursement rt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateReimbursement(String rtID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReimbursement(String rtID) {
		// TODO Auto-generated method stub

	}

}

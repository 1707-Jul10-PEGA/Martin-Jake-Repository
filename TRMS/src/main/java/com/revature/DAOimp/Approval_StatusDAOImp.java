package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.Approval_StatusDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Approval_Status;

public class Approval_StatusDAOImp implements Approval_StatusDAO {

	ArrayList<Approval_Status> al;
	
	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
		al = new ArrayList<Approval_Status>();
	}
	
	public Approval_StatusDAOImp() {
		super();
		setup();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Approval_StatusDAO> getAllApproval_Status() {
		// TODO Auto-generated method stub
		conn = cf.getConnection();
		String sql = "SELECT * FROM APPROVAL_STATUS";
		Statement s ;
		
		
		try {
			s= conn.createStatement();
			rs = s.executeQuery(sql);
			while(rs.next()){
			//make it into an object, add to al.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public Approval_Status getApproval_Status(String AStid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addApproval_Status(Approval_StatusDAO as) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateApproval_Status(String ASID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteApproval_Status(String ASID) {
		// TODO Auto-generated method stub

	}

}

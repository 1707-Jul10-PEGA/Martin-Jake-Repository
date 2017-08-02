package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.TR_Form_User_Approval_StatusDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;
import com.revature.objects.TR_Form_User_Approval_Status;

public class TR_Form_User_Approval_StatusDAOImp implements TR_Form_User_Approval_StatusDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;

	public void setup() {
		cf = ConnectionFactory.getInstance();
	}

	public TR_Form_User_Approval_StatusDAOImp() {
		super();

		setup();

	}

	@Override
	public List<TR_Form_User_Approval_Status> getAllTUAS() {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM TR_User_Approval_Status";
		Statement s;

		List<TR_Form_User_Approval_Status> al = new ArrayList<TR_Form_User_Approval_Status>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				TR_Form_User_Approval_Status ap = new TR_Form_User_Approval_Status(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
				ap.setTUAS_ID((rs.getString(1)));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
		
		
	}

	@Override
	public TR_Form_User_Approval_Status getTUAS(String tid) {
		conn = cf.getConnection();
		String sql = "SELECT * FROM TR_User_Approval_Status WHERE tuas_ID=?";
		TR_Form_User_Approval_Status ap = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new TR_Form_User_Approval_Status(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
				ap.setTUAS_ID((rs.getString(1)));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void addTUAS(TR_Form_User_Approval_Status t) {
		conn = cf.getConnection();
		String sql = "INSERT INTO TR_User_Approval_Status (tuas_id, tr_id,approver_id, status_id,time_approved) VALUES (?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getTUAS_ID());
			ps.setString(2, t.getTR_ID());
			ps.setString(3, t.getAPPROVER_ID());
			ps.setString(4, t.getSTATUS_ID());
			ps.setString(5, t.getTIME_APPROVED());
	
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}


	}

	public void updateTUAS(String tID, TR_Form_User_Approval_Status t) {
		conn = cf.getConnection();
		String sql = "UPDATE TR_User_Approval_Status SET " + "Tuas_id=?, tr_id=?,approver_ID=?, status_id=?,time_approved=?" + "WHERE tuas_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getTUAS_ID());
			ps.setString(2, t.getTR_ID());
			ps.setString(3, t.getAPPROVER_ID());
			ps.setString(4, t.getSTATUS_ID());
			ps.setString(5, t.getTIME_APPROVED());
			
			ps.setString(6, tID);
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}


	}

	@Override
	public void deleteTUAS(String tID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTUAS(String tID) {
		// TODO Auto-generated method stub
		
	}

}

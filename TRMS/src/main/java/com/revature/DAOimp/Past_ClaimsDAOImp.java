package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM Past_Claims";
		Statement s;

		List<Past_Claims> al = new ArrayList<Past_Claims>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Past_Claims ap = new Past_Claims(rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5));
				ap.setCLAIM_ID(rs.getString(1));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Past_Claims getPast_Claims(String PCid) {
		conn = cf.getConnection();
		String sql = "SELECT * FROM Past_Claim where CLAIM_ID=?";
		
		Past_Claims ap =null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, PCid);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				ap = new Past_Claims(rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5));
				ap.setCLAIM_ID(rs.getString(1));

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void addPast_Claims(Past_Claims pc) {

		conn = cf.getConnection();
		String sql = "INSERT INTO Past_Claim (Claim_id, employee_id,AMMOUNT_SUCESSFULLY_REIMBURSE, Date_reimbursed,tr_id) VALUES (?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pc.getCLAIM_ID());
			ps.setString(2, pc.getEMPLOYEE_ID());
			ps.setDouble(3, pc.getFINAL_REIMBURSEMENT());
			ps.setString(4, pc.getDATE_REIMBURSED());
			ps.setString(5, pc.getTR_ID());
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}


	}

	@Override
	public void updatePast_Claims(String pcID, Past_Claims pc) {
		conn = cf.getConnection();
		String sql = "UPDATE Past_Claim SET Claim_id=?, employee_id=?,AMMOUNT_SUCESSFULLY_REIMBURSE=?, Date_reimbursed=?,tr_id=?) where claim_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pc.getCLAIM_ID());
			ps.setString(2, pc.getEMPLOYEE_ID());
			ps.setDouble(3, pc.getFINAL_REIMBURSEMENT());
			ps.setString(4, pc.getDATE_REIMBURSED());
			ps.setString(5, pc.getTR_ID());
			ps.setString(6, pcID);
			
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}


	}

	@Override
	public void deletePast_Claims(String pcID) {
		// TODO Auto-generated method stub

	}

}

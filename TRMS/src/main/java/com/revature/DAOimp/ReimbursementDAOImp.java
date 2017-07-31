package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public List<Reimbursement> getAllReimbursements() throws SQLException {
		// TODO Auto-generated method stub
		List<Reimbursement> reimbursementList = new ArrayList<Reimbursement>();
		conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENT";
		Statement statement;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("REIMBURSEMENT_ID");
				int type = Integer.parseInt(rs.getString("REIMBURSEMENT_TYPE_ID"));
				double ammount_requested = Double.parseDouble(rs.getString("REIMBURSEMENT_REQUESTED"));
				double final_ammount = Double.parseDouble(rs.getString("FINAL_REIMBURSEMENT_AMMOUNT"));
				String reason = rs.getString("REASON");
				
								
				Reimbursement reimbursement = new Reimbursement(id, type, ammount_requested, final_ammount, reason);
				reimbursementList.add(reimbursement);
			}
			
			conn.close();
			return reimbursementList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
<<<<<<< HEAD
		}finally {
			if (conn != null) {
				conn.close();
			}
=======
>>>>>>> 90e1f104d077ef9c012bc0b00b1d6ba3d94cbb20
		}
	
		return null;
	}

	@Override
	public Reimbursement getReimbursement(String rid) throws SQLException {
		// TODO Auto-generated method stub
		Reimbursement reimbursement = null;
		conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENT WHERE REIMBURSEMENT_ID = '"+rid+"'";
		Statement statement;
		try {
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			
			if(rs.next()) {
				String id = rs.getString("REIMBURSEMENT_ID");
				int type = Integer.parseInt(rs.getString("REIMBURSEMENT_TYPE_ID"));
				double ammount_requested = Double.parseDouble(rs.getString("REIMBURSEMENT_REQUESTED"));
				double final_ammount = Double.parseDouble(rs.getString("FINAL_REIMBURSEMENT_AMMOUNT"));
				String reason = rs.getString("REASON");			
				reimbursement = new Reimbursement(id, type, ammount_requested, final_ammount, reason);
			}
			
			conn.close();
			return reimbursement;
			
		}	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
<<<<<<< HEAD
		}finally {
			if (conn != null) {
				conn.close();
			}
=======
>>>>>>> 90e1f104d077ef9c012bc0b00b1d6ba3d94cbb20
		}
		
		return null;
	}

	@Override
	public void addReimbursement(Reimbursement rt) throws SQLException {
		// TODO Auto-generated method stub
		conn = cf.getConnection();
		String rId = rt.getREIMBURSEMENT_ID();
		int type = rt.getREIMBURSEMENT_TYPE_ID();
		double requested = rt.getREIMBURSEMENT_REQUESTED();
		double finalRequested = rt.getFINAL_REIMBURSEMENT_AMOUNT();
		String reason = rt.getREASON();
		
		String sql = "INSERT INTO REIMBURSEMENT VALUES"
				+ " ("
				+ "'" + rId + "',"
				+ "" + type + ","
				+ "" + requested + ","
				+ "" + finalRequested + ","
				+ "'" + reason + "'"
				+ ")";		
		
		try {
			Statement statement = conn.createStatement();
			statement.executeQuery(sql);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
<<<<<<< HEAD
		}finally {
			if (conn != null) {
				conn.close();
			}
=======
>>>>>>> 90e1f104d077ef9c012bc0b00b1d6ba3d94cbb20
		}
		
	}

	/*
	 * Takes Reimbursement ID and Reimbursement Object.
	 * Searches for the Reimbursement by ID and then updates
	 * all fields (except ID) to those of the passed object.
	 */
	@Override
	public void updateReimbursement(String rtID, Reimbursement reimbursement) throws SQLException{
		// TODO Auto-generated method stub
		conn = cf.getConnection();
		PreparedStatement preparedStatement = null;
		
		String rId = reimbursement.getREIMBURSEMENT_ID();
		int type = reimbursement.getREIMBURSEMENT_TYPE_ID();
		double requested = reimbursement.getREIMBURSEMENT_REQUESTED();
		double finalRequested = reimbursement.getFINAL_REIMBURSEMENT_AMOUNT();
		String reason = reimbursement.getREASON();
		
		String sql = "UPDATE REIMBURSEMENT SET "
				+ "REIMBURSEMENT_TYPE_ID = ? ,"
				+ "REIMBURSEMENT_REQUESTED = ? ,"
				+ "FINAL_REIMBURSEMENT_AMMOUNT = ? ,"
				+ "REASON = ? "
				+ "WHERE  REIMBURSEMENT_ID = ?";
			
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, type);
			preparedStatement.setDouble(2, requested);
			preparedStatement.setDouble(3, finalRequested);
			preparedStatement.setString(4, reason);
			preparedStatement.setString(5, rId);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Record has been updated");
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
<<<<<<< HEAD
			if (conn != null) {
				conn.close();
=======
			if (preparedStatement != null) {
				preparedStatement.close();
>>>>>>> 90e1f104d077ef9c012bc0b00b1d6ba3d94cbb20
			}
		}
			
	}

	@Override
	public void deleteReimbursement(String rtID) {
		// TODO Auto-generated method stub

	}
}

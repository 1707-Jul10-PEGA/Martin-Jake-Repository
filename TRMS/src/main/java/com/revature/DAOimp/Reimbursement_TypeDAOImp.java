package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.Reimbursement_TypeDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;
import com.revature.objects.Reimbursement_Type;

public class Reimbursement_TypeDAOImp implements Reimbursement_TypeDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;

	public void setup() {
		cf = ConnectionFactory.getInstance();
	}

	public Reimbursement_TypeDAOImp() {
		super();

		setup();

	}

	@Override
	public List<Reimbursement_Type> getAllReimbursement_Types() {

		conn = cf.getConnection();
		String sql = "SELECT * FROM Reimbursement_Type";
		Statement s;

		List<Reimbursement_Type> al = new ArrayList<Reimbursement_Type>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Reimbursement_Type ap = new Reimbursement_Type(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				al.add(ap);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return al;

	}

	@Override
	public Reimbursement_Type getReimbursement_Type(String rtid) {

		conn = cf.getConnection();
		String sql = "SELECT * FROM Reimbursement_Type where Reimbursement_Type_ID=?";
		Statement s;

		Reimbursement_Type ap = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, rtid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Reimbursement_Type(rs.getInt(1), rs.getString(2), rs.getDouble(3));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return ap;

	}

	@Override
	public void addReimbursement_Type(Reimbursement_Type rt) {
		conn = cf.getConnection();
		String sql = "INSERT INTO Reimbursement_Type (Reimbursement_Type_ID, tr_name,percentage) VALUES (?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, rt.getREIMBURSEMENT_TYPE_ID());
			ps.setString(2, rt.getREIMBURSEMENT_TYPE_NAME() );
			ps.setDouble(3, rt.getPERCENTAGE());
		
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void updateReimbursement_Type(String rtID, Reimbursement_Type emp ) {
		conn = cf.getConnection();
		String sql = "UPDATE Reimbursement_Type SET " + "Reimbursement_Type_id=?, tr_name=?,percentage=?" + "WHERE Reimbursement_Type_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, emp.getREIMBURSEMENT_TYPE_ID());
			ps.setString(2, emp.getREIMBURSEMENT_TYPE_NAME());
			ps.setDouble(3, emp.getPERCENTAGE());
			
			ps.setInt(4, Integer.parseInt(rtID));
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void deleteReimbursement_Type(String rtID) {
		// TODO Auto-generated method stub

	}

}

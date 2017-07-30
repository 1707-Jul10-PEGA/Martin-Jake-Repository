package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.Approval_StatusDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Approval_Status;

public class Approval_StatusDAOImp implements Approval_StatusDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;

	public void setup() {
		cf = ConnectionFactory.getInstance();
	}

	public Approval_StatusDAOImp() {
		super();
		setup();

	}

	@Override
	public List<Approval_Status> getAllApproval_Status() {

		conn = cf.getConnection();
		String sql = "SELECT * FROM APPROVAL_STATUS";
		Statement s;

		List<Approval_Status> al = new ArrayList<Approval_Status>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Approval_Status ap = new Approval_Status(rs.getInt(1), rs.getString(2));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Approval_Status getApproval_Status(String AStid) {
	

		conn = cf.getConnection();
		String sql = "SELECT * FROM APPROVAL_STATUS WHERE APPROVAL_STATUS=?";
		Approval_Status ap = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, AStid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Approval_Status(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void updateApproval_Status(String ASID, Approval_Status as) {
	

		conn = cf.getConnection();
		String sql = "UPDATE Approval_Status SET " + "Approval_Status=?, Approval_Type=?" + "WHERE Approval_Status=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, as.getAPPROVAL_STATUS());
			ps.setString(2, as.getAPPROVAL_TYPE());
			ps.setInt(3, Integer.parseInt(ASID));
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void deleteApproval_Status(String ASID) {
	

		// Implement Later

	}

	@Override
	public void addApproval_Status(Approval_Status as) {
		// TODO Auto-generated method stub

		conn = cf.getConnection();
		String sql = "INSERT INTO Approval_Status (Approval_Status, Approval_Type) VALUES (?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, as.getAPPROVAL_STATUS());
			ps.setString(2, as.getAPPROVAL_TYPE());
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

}

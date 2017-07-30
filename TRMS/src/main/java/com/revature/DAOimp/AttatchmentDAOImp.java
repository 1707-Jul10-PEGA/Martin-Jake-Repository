package com.revature.DAOimp;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.AttatchmentDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Attatchment;
import com.revature.objects.Log;

public class AttatchmentDAOImp implements AttatchmentDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}
	
	public AttatchmentDAOImp() {
		super();
		setup();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Attatchment> getAllAttatchment() {
		conn = cf.getConnection();
		String sql = "SELECT * FROM Attatchment";
		Statement s;

		List<Attatchment> al = new ArrayList<Attatchment>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Attatchment a = new Attatchment(rs.getBlob(2), rs.getString(3));
				a.setATTATCHMENT_ID(rs.getString(1));
				
				al.add(a);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Attatchment getAttatchment(String Attatchmentid) {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM Attatchment WHERE Attatchment_ID=?";
		Attatchment ap = null;

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Attatchmentid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Attatchment(rs.getBlob(2), rs.getString(3));
				ap.setATTATCHMENT_ID(rs.getString(1));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ap;

	}

	@Override
	public void addAttatchment(Attatchment a) {
		// TODO Auto-generated method stub

		conn = cf.getConnection();
		String sql = "INSERT INTO Attatchment (Attatchment_ID, Attatchment, TR_ID) VALUES (?,?,?)";

		try {
			File blob = new File("../src/test/resources/hey.txt");
			//FileInputStream in = new FileInputStream(blob);
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, a.getATTATCHMENT_ID());
			//ps.setBinaryStream(2,in, (int)blob.length());
			ps.setString(3, a.getTR_FORM_ID());
			ps.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAttatchment(String AttatchmentID, Attatchment att) {
	
		conn = cf.getConnection();
		String sql = "UPDATE Attatchment SET " + "Attatchment_ID=?, Attatchment=?, TR_ID=?" + "WHERE Attatchment_ID=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, att.getATTATCHMENT_ID());
			ps.setBlob(2, att.getBLOB());
			ps.setString(3, att.getTR_FORM_ID());
			ps.setString(4, AttatchmentID);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteAttatchment(String AttatchmentID) {
		// TODO Auto-generated method stub

	}

}

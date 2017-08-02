package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.TitleDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;
import com.revature.objects.Title;

public class TitleDAOImp implements TitleDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public TitleDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Title> getAllTitles() {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM Title";
		Statement s;

		List<Title> al = new ArrayList<Title>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Title ap = new Title(rs.getInt(1), rs.getString(2));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
		
		
		
	}

	@Override
	public Title getTitle(String tid) {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM Title WHERE Title_ID=?";
		Title ap = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Title(rs.getInt(1), rs.getString(2));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
		
	}

	@Override
	public void addTitle(Title t) {
		conn = cf.getConnection();
		String sql = "INSERT INTO Title (Title_id, Title_description) VALUES (?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getTITLE_ID());
			ps.setString(2, t.getTITLE_DESCRIPTION());
			
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	public void updateTitle(String tID, Title t) {
		conn = cf.getConnection();
		String sql = "UPDATE Title SET " + "Title_id=?, Title_description=?" + "WHERE title_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getTITLE_ID());
			ps.setString(2, t.getTITLE_DESCRIPTION());
			
			ps.setString(3, tID);
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void deleteTitle(String tID) {
		// TODO Auto-generated method stub

	}


}

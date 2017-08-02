package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.EventDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;
import com.revature.objects.Event;

public class EventDAOImp implements EventDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;

	public void setup() {
		cf = ConnectionFactory.getInstance();
	}

	public EventDAOImp() {
		super();

		setup();

	}

	@Override
	public List<Event> getAllEvents() {
		conn = cf.getConnection();
		String sql = "SELECT * FROM Event";
		Statement s;

		List<Event> al = new ArrayList<Event>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Event ap = new Event(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
				ap.setEVENT_ID(rs.getString(1));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Event getEvent(String eventid) {
		conn = cf.getConnection();
		String sql = "SELECT * FROM Event WHERE Event_ID=?";
		Event ap = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, eventid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Event(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
				ap.setEVENT_ID(rs.getString(1));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void addEvent(Event e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEvent(String eventID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEvent(String eventID) {
		// TODO Auto-generated method stub

	}

}

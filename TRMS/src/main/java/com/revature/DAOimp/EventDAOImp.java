package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.EventDAO;
import com.revature.database.ConnectionFactory;
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
				Event ap = new Event(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getString(8));
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
				ap = new Event(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6),
						rs.getInt(7), rs.getString(8));
				ap.setEVENT_ID(rs.getString(1));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void addEvent(Event e) {

		conn = cf.getConnection();
		String sql = "INSERT INTO Event (Event_id, Date_of_event, location, Description, Minimum_passing_grade, grading_required, Event_end_date, Event_name) VALUES (?,?,?,?,?,?,?,?)";
		
		SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd" );
		

		try {
			java.sql.Date sqlDate = java.sql.Date.valueOf(e.getEND_DATE());
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getEVENT_ID());
			
			ps.setDate(2, getCurrentDate());
			
			ps.setString(3, e.getLOCATION());
			ps.setString(4, e.getDESCRIPTION());
			ps.setInt(5, e.getMINIMUM_PASSING_GRADE());
			ps.setInt(6, e.getGRADING_REQUIRED());
			
			ps.setDate(7, sqlDate);
			
			ps.setString(8, e.getEVENT_NAME());
			ps.executeUpdate();

		} catch (SQLException e1) {

			e1.printStackTrace();
		} 

	}

	public void updateEvent(String eventID, Event e) {
		conn = cf.getConnection();
		String sql = "UPDATE Event SET Event_id=?, Date_of_event=?, location=?, Description=?, Minimum_passing_grade=?, grading_required=?, Event_end_date=?, Event_name=? where event_ID=?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, e.getEVENT_ID());
			ps.setString(2, e.getSTART_DATE());
			ps.setString(3, e.getLOCATION());
			ps.setString(4, e.getDESCRIPTION());
			ps.setInt(5, e.getMINIMUM_PASSING_GRADE());
			ps.setInt(6, e.getGRADING_REQUIRED());
			ps.setString(7, e.getEND_DATE());
			ps.setString(8, e.getEVENT_NAME());
			ps.setString(9, eventID);
			ps.executeUpdate();
		

		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}


	}
	
	private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}

	@Override
	public void deleteEvent(String eventID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEvent(String eventID) {
		// TODO Auto-generated method stub
		
	}

}

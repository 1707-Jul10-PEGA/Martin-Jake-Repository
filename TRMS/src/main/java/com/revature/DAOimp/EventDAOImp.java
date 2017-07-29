package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.EventDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Event;

public class EventDAOImp implements EventDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public EventDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event getEvent(String eventid) {
		// TODO Auto-generated method stub
		return null;
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

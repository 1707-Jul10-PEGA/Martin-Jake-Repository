package com.revature.DAO;

import java.util.List;

import com.revature.objects.Event;

public interface EventDAO {

	public List<Event> getAllEvents();

	public Event getEvent(String eventid);

	public void addEvent(Event e);

	public void updateEvent(String eventID);

	public void deleteEvent(String eventID);

}

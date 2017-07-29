package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.revature.DAO.TitleDAO;
import com.revature.database.ConnectionFactory;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title getTitle(String tid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTitle(Title t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTitle(String tID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTitle(String tID) {
		// TODO Auto-generated method stub

	}

}

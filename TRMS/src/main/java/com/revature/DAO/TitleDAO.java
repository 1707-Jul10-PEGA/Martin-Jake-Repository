package com.revature.DAO;

import java.util.List;

import com.revature.objects.Title;

public interface TitleDAO {

	public List<Title> getAllTitles();	
	
	public Title getTitle(String tid);
	
	public void addTitle(Title t);
	
	public void updateTitle(String tID, Title t);
	
	public void deleteTitle(String tID);
	

	
	
}

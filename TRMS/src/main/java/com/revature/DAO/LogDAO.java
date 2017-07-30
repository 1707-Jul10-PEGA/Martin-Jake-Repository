package com.revature.DAO;

import java.util.List;

import com.revature.objects.Log;


public interface LogDAO {

	public List<Log> getAllLogs();

	public Log getLog(String logid);

	public void addLog(Log l);

	public void updateLog(String logID, Log log);

	public void deleteLog(String logID);
	
	
}

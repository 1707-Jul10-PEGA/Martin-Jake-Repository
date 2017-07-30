package com.revature.Tests;

import com.revature.DAOimp.LogDAOImp;
import com.revature.objects.Log;

public class Log_Tests {

	public static void main(String[] args) {

		LogDAOImp l = new LogDAOImp();

		// Test for adding logs SUCCESS
		//Log log = new Log("2017-07-19", "Its a test log.");
		//l.addLog(log);

		//Test for printing all logs SUCCESS
//		for (Log x : l.getAllLogs()){
//			System.out.println(x.toString());
//		}
		
		//Test for printing specific logs SUCCESS
		//System.out.println(l.getLog("310913af-0348-4b31-b5f6-e396499ba7b1"));
		
		//Test for updating logs SUCCESS
//		Log log = new Log("2017-08-19", "Updated test log.");
//		l.updateLog("310913af-0348-4b31-b5f6-e396499ba7b1", log);

	}

}

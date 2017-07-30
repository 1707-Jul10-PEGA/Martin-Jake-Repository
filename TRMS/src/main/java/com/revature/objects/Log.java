package com.revature.objects;

import java.util.UUID;

public class Log {

	private String LOG_ID;
	private String LOG_DATETIME;
	private String LOG_TEXT;
	
	
	public Log(){}


	public Log(String lOG_DATETIME, String lOG_TEXT) {
		super();
		LOG_ID = UUID.randomUUID().toString();
		LOG_DATETIME = lOG_DATETIME;
		LOG_TEXT = lOG_TEXT;
	}


	@Override
	public String toString() {
		return "Log [LOG_ID=" + LOG_ID + ", LOG_DATETIME=" + LOG_DATETIME + ", LOG_TEXT=" + LOG_TEXT + "]";
	}


	public String getLOG_ID() {
		return LOG_ID;
	}


	public void setLOG_ID(String lOG_ID) {
		LOG_ID = lOG_ID;
	}


	public String getLOG_DATETIME() {
		return LOG_DATETIME;
	}


	public void setLOG_DATETIME(String lOG_DATETIME) {
		LOG_DATETIME = lOG_DATETIME;
	}


	public String getLOG_TEXT() {
		return LOG_TEXT;
	}


	public void setLOG_TEXT(String lOG_TEXT) {
		LOG_TEXT = lOG_TEXT;
	}
	
	
	
}

package com.revature.objects;

public class Event {

	private String EVENT_ID;
	private String START_DATE;
	private String END_DATE;
	private String LOCATION;
	private String DESCRIPTION;
	private int MINIMUM_PASSING_GRADE;
	private int GRADING_REQUIRED;
	
	public Event(){}

	
	
	public Event(String eVENT_ID, String sTART_DATE, String eND_DATE, String lOCATION, String dESCRIPTION,
			int mINIMUM_PASSING_GRADE, int gRADING_REQUIRED) {
		super();
		EVENT_ID = eVENT_ID;
		START_DATE = sTART_DATE;
		END_DATE = eND_DATE;
		LOCATION = lOCATION;
		DESCRIPTION = dESCRIPTION;
		MINIMUM_PASSING_GRADE = mINIMUM_PASSING_GRADE;
		GRADING_REQUIRED = gRADING_REQUIRED;
	}



	@Override
	public String toString() {
		return "Event [EVENT_ID=" + EVENT_ID + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", LOCATION="
				+ LOCATION + ", DESCRIPTION=" + DESCRIPTION + ", MINIMUM_PASSING_GRADE=" + MINIMUM_PASSING_GRADE
				+ ", GRADING_REQUIRED=" + GRADING_REQUIRED + "]";
	}



	public String getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public String getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	public String getLOCATION() {
		return LOCATION;
	}

	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public int getMINIMUM_PASSING_GRADE() {
		return MINIMUM_PASSING_GRADE;
	}

	public void setMINIMUM_PASSING_GRADE(int mINIMUM_PASSING_GRADE) {
		MINIMUM_PASSING_GRADE = mINIMUM_PASSING_GRADE;
	}

	public int getGRADING_REQUIRED() {
		return GRADING_REQUIRED;
	}

	public void setGRADING_REQUIRED(int gRADING_REQUIRED) {
		GRADING_REQUIRED = gRADING_REQUIRED;
	}
	
	
}

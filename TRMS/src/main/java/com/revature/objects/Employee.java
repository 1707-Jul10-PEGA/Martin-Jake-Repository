package com.revature.objects;

import java.util.UUID;

public class Employee {

	private String EMPLOYEE_ID;
	private String USERNAME;
	private String PASS_WORD;
	private String FNAME;
	private String LNAME;
	private int TITLE;
	private int BEN_CO_MEMBER;
	private String SUPERVISED_BY;
	
	public Employee(){}

	public Employee(String uSERNAME, String pASS_WORD, String fNAME, String lNAME, int tITLE,
			int bEN_CO_MEMBER, String sUPERVISED_BY) {
		super();
		EMPLOYEE_ID = UUID.randomUUID().toString();
		USERNAME = uSERNAME;
		PASS_WORD = pASS_WORD;
		FNAME = fNAME;
		LNAME = lNAME;
		TITLE = tITLE;
		BEN_CO_MEMBER = bEN_CO_MEMBER;
		SUPERVISED_BY = sUPERVISED_BY;
	}
	
	@Override
	public String toString() {
		return "Employee [EMPLOYEE_ID=" + EMPLOYEE_ID + ", USERNAME=" + USERNAME + ", PASS_WORD=" + PASS_WORD
				+ ", FNAME=" + FNAME + ", LNAME=" + LNAME + ", TITLE=" + TITLE + ", BEN_CO_MEMBER=" + BEN_CO_MEMBER
				+ ", SUPERVISED_BY=" + SUPERVISED_BY + "]";
	}
	
	

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASS_WORD() {
		return PASS_WORD;
	}

	public void setPASS_WORD(String pASS_WORD) {
		PASS_WORD = pASS_WORD;
	}

	public String getFNAME() {
		return FNAME;
	}

	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}

	public String getLNAME() {
		return LNAME;
	}

	public void setLNAME(String lNAME) {
		LNAME = lNAME;
	}

	public int getTITLE() {
		return TITLE;
	}

	public void setTITLE(int tITLE) {
		TITLE = tITLE;
	}

	public int getBEN_CO_MEMBER() {
		return BEN_CO_MEMBER;
	}

	public void setBEN_CO_MEMBER(int bEN_CO_MEMBER) {
		BEN_CO_MEMBER = bEN_CO_MEMBER;
	}

	public String getSUPERVISED_BY() {
		return SUPERVISED_BY;
	}

	public void setSUPERVISED_BY(String sUPERVISED_BY) {
		SUPERVISED_BY = sUPERVISED_BY;
	}
	
	
	
	
	
}

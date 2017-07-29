package com.revature.objects;

public class Approver_Status {

	
	private int APPROVAL_STATUS;
	private String APPROVAL_TYPE;
	
	public Approver_Status(){}

	public Approver_Status(int aPPROVAL_STATUS, String aPPROVAL_TYPE) {
		super();
		APPROVAL_STATUS = aPPROVAL_STATUS;
		APPROVAL_TYPE = aPPROVAL_TYPE;
	}

	@Override
	public String toString() {
		return "Approver_Status [APPROVAL_STATUS=" + APPROVAL_STATUS + ", APPROVAL_TYPE=" + APPROVAL_TYPE + "]";
	}

	public int getAPPROVAL_STATUS() {
		return APPROVAL_STATUS;
	}

	public void setAPPROVAL_STATUS(int aPPROVAL_STATUS) {
		APPROVAL_STATUS = aPPROVAL_STATUS;
	}

	public String getAPPROVAL_TYPE() {
		return APPROVAL_TYPE;
	}

	public void setAPPROVAL_TYPE(String aPPROVAL_TYPE) {
		APPROVAL_TYPE = aPPROVAL_TYPE;
	}
	
	
}

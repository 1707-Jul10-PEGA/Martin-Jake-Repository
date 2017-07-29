package com.revature.objects;

public class TR_Form {

	

	private String TR_ID;
	private String EMPLOYEE_ID;
	private String DATE_CREATED;
	private String EVENT_ID;
	private int REQUIRES_MORE_INFO;
	private String REIMBURSEMENT_ID;
	private int APPROVAL_STATUS;
	private String FINAL_GRADE;
	
	public TR_Form(){}
	
	public TR_Form(String tR_ID, String eMPLOYEE_ID, String dATE_CREATED, String eVENT_ID, int rEQUIRES_MORE_INFO,
			String rEIMBURSEMENT_ID, int aPPROVAL_STATUS, String fINAL_GRADE) {
		super();
		TR_ID = tR_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		DATE_CREATED = dATE_CREATED;
		EVENT_ID = eVENT_ID;
		REQUIRES_MORE_INFO = rEQUIRES_MORE_INFO;
		REIMBURSEMENT_ID = rEIMBURSEMENT_ID;
		APPROVAL_STATUS = aPPROVAL_STATUS;
		FINAL_GRADE = fINAL_GRADE;
	}

	@Override
	public String toString() {
		return "TR_Form [TR_ID=" + TR_ID + ", EMPLOYEE_ID=" + EMPLOYEE_ID + ", DATE_CREATED=" + DATE_CREATED
				+ ", EVENT_ID=" + EVENT_ID + ", REQUIRES_MORE_INFO=" + REQUIRES_MORE_INFO + ", REIMBURSEMENT_ID="
				+ REIMBURSEMENT_ID + ", APPROVAL_STATUS=" + APPROVAL_STATUS + ", FINAL_GRADE=" + FINAL_GRADE + "]";
	}

	public String getTR_ID() {
		return TR_ID;
	}

	public void setTR_ID(String tR_ID) {
		TR_ID = tR_ID;
	}

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getDATE_CREATED() {
		return DATE_CREATED;
	}

	public void setDATE_CREATED(String dATE_CREATED) {
		DATE_CREATED = dATE_CREATED;
	}

	public String getEVENT_ID() {
		return EVENT_ID;
	}

	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	public int getREQUIRES_MORE_INFO() {
		return REQUIRES_MORE_INFO;
	}

	public void setREQUIRES_MORE_INFO(int rEQUIRES_MORE_INFO) {
		REQUIRES_MORE_INFO = rEQUIRES_MORE_INFO;
	}

	public String getREIMBURSEMENT_ID() {
		return REIMBURSEMENT_ID;
	}

	public void setREIMBURSEMENT_ID(String rEIMBURSEMENT_ID) {
		REIMBURSEMENT_ID = rEIMBURSEMENT_ID;
	}

	public int getAPPROVAL_STATUS() {
		return APPROVAL_STATUS;
	}

	public void setAPPROVAL_STATUS(int aPPROVAL_STATUS) {
		APPROVAL_STATUS = aPPROVAL_STATUS;
	}

	public String getFINAL_GRADE() {
		return FINAL_GRADE;
	}

	public void setFINAL_GRADE(String fINAL_GRADE) {
		FINAL_GRADE = fINAL_GRADE;
	}	
	
	
	
	
	
}
package com.revature.objects;

import java.util.UUID;

public class TR_Form_User_Approval_Status {

	//I apologize for the unwieldy name, but it makes sense in context 
	private String TUAS_ID;
	private String TR_ID;
	private String APPROVER_ID;
	private String STATUS_ID;
	private String TIME_APPROVED;
	
	public TR_Form_User_Approval_Status(){}

	public TR_Form_User_Approval_Status(String tR_ID, String aPPROVER_ID, String sTATUS_ID,
			String tIME_APPROVED) {
		super();
		TUAS_ID = UUID.randomUUID().toString();
		TR_ID = tR_ID;
		APPROVER_ID = aPPROVER_ID;
		STATUS_ID = sTATUS_ID;
		TIME_APPROVED = tIME_APPROVED;
	}

	@Override
	public String toString() {
		return "TR_Form_User_Approval_Status [TUAS_ID=" + TUAS_ID + ", TR_ID=" + TR_ID + ", APPROVER_ID=" + APPROVER_ID
				+ ", STATUS_ID=" + STATUS_ID + ", TIME_APPROVED=" + TIME_APPROVED + "]";
	}

	public String getTUAS_ID() {
		return TUAS_ID;
	}

	public void setTUAS_ID(String tUAS_ID) {
		TUAS_ID = tUAS_ID;
	}

	public String getTR_ID() {
		return TR_ID;
	}

	public void setTR_ID(String tR_ID) {
		TR_ID = tR_ID;
	}

	public String getAPPROVER_ID() {
		return APPROVER_ID;
	}

	public void setAPPROVER_ID(String aPPROVER_ID) {
		APPROVER_ID = aPPROVER_ID;
	}

	public String getSTATUS_ID() {
		return STATUS_ID;
	}

	public void setSTATUS_ID(String sTATUS_ID) {
		STATUS_ID = sTATUS_ID;
	}

	public String getTIME_APPROVED() {
		return TIME_APPROVED;
	}

	public void setTIME_APPROVED(String tIME_APPROVED) {
		TIME_APPROVED = tIME_APPROVED;
	}
	
	
	
	
	
	
}

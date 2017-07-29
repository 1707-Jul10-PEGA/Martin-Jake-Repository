package com.revature.objects;

public class Reimbursement {

	private String REIMBURSEMENT_ID;
	private int REIMBURSEMENT_TYPE_ID;
	private double REIMBURSEMENT_REQUESTED;
	private double FINAL_REIMBURSEMENT_AMOUNT;
	private String REASON;
	
	
	public Reimbursement(){}


	public Reimbursement(String rEIMBURSEMENT_ID, int rEIMBURSEMENT_TYPE_ID, double rEIMBURSEMENT_REQUESTED,
			double fINAL_REIMBURSEMENT_AMOUNT, String rEASON) {
		super();
		REIMBURSEMENT_ID = rEIMBURSEMENT_ID;
		REIMBURSEMENT_TYPE_ID = rEIMBURSEMENT_TYPE_ID;
		REIMBURSEMENT_REQUESTED = rEIMBURSEMENT_REQUESTED;
		FINAL_REIMBURSEMENT_AMOUNT = fINAL_REIMBURSEMENT_AMOUNT;
		REASON = rEASON;
	}


	@Override
	public String toString() {
		return "Reimbursement [REIMBURSEMENT_ID=" + REIMBURSEMENT_ID + ", REIMBURSEMENT_TYPE_ID="
				+ REIMBURSEMENT_TYPE_ID + ", REIMBURSEMENT_REQUESTED=" + REIMBURSEMENT_REQUESTED
				+ ", FINAL_REIMBURSEMENT_AMOUNT=" + FINAL_REIMBURSEMENT_AMOUNT + ", REASON=" + REASON + "]";
	}


	public String getREIMBURSEMENT_ID() {
		return REIMBURSEMENT_ID;
	}


	public void setREIMBURSEMENT_ID(String rEIMBURSEMENT_ID) {
		REIMBURSEMENT_ID = rEIMBURSEMENT_ID;
	}


	public int getREIMBURSEMENT_TYPE_ID() {
		return REIMBURSEMENT_TYPE_ID;
	}


	public void setREIMBURSEMENT_TYPE_ID(int rEIMBURSEMENT_TYPE_ID) {
		REIMBURSEMENT_TYPE_ID = rEIMBURSEMENT_TYPE_ID;
	}


	public double getREIMBURSEMENT_REQUESTED() {
		return REIMBURSEMENT_REQUESTED;
	}


	public void setREIMBURSEMENT_REQUESTED(double rEIMBURSEMENT_REQUESTED) {
		REIMBURSEMENT_REQUESTED = rEIMBURSEMENT_REQUESTED;
	}


	public double getFINAL_REIMBURSEMENT_AMOUNT() {
		return FINAL_REIMBURSEMENT_AMOUNT;
	}


	public void setFINAL_REIMBURSEMENT_AMOUNT(double fINAL_REIMBURSEMENT_AMOUNT) {
		FINAL_REIMBURSEMENT_AMOUNT = fINAL_REIMBURSEMENT_AMOUNT;
	}


	public String getREASON() {
		return REASON;
	}


	public void setREASON(String rEASON) {
		REASON = rEASON;
	}
	
	
	
	
}
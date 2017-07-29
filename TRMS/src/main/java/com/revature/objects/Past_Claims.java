package com.revature.objects;

public class Past_Claims {

	
	private String CLAIM_ID;
	private String EMPLOYEE_ID;
	private double FINAL_REIMBURSEMENT;
	private String DATE_REIMBURSED;
	private String TR_ID;
	
	public Past_Claims(){}

	public Past_Claims(String cLAIM_ID, String eMPLOYEE_ID, double fINAL_REIMBURSEMENT, String dATE_REIMBURSED,
			String tR_ID) {
		super();
		CLAIM_ID = cLAIM_ID;
		EMPLOYEE_ID = eMPLOYEE_ID;
		FINAL_REIMBURSEMENT = fINAL_REIMBURSEMENT;
		DATE_REIMBURSED = dATE_REIMBURSED;
		TR_ID = tR_ID;
	}

	@Override
	public String toString() {
		return "Past_Claims [CLAIM_ID=" + CLAIM_ID + ", EMPLOYEE_ID=" + EMPLOYEE_ID + ", FINAL_REIMBURSEMENT="
				+ FINAL_REIMBURSEMENT + ", DATE_REIMBURSED=" + DATE_REIMBURSED + ", TR_ID=" + TR_ID + "]";
	}

	public String getCLAIM_ID() {
		return CLAIM_ID;
	}

	public void setCLAIM_ID(String cLAIM_ID) {
		CLAIM_ID = cLAIM_ID;
	}

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(String eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public double getFINAL_REIMBURSEMENT() {
		return FINAL_REIMBURSEMENT;
	}

	public void setFINAL_REIMBURSEMENT(double fINAL_REIMBURSEMENT) {
		FINAL_REIMBURSEMENT = fINAL_REIMBURSEMENT;
	}

	public String getDATE_REIMBURSED() {
		return DATE_REIMBURSED;
	}

	public void setDATE_REIMBURSED(String dATE_REIMBURSED) {
		DATE_REIMBURSED = dATE_REIMBURSED;
	}

	public String getTR_ID() {
		return TR_ID;
	}

	public void setTR_ID(String tR_ID) {
		TR_ID = tR_ID;
	}
	
	
	
}

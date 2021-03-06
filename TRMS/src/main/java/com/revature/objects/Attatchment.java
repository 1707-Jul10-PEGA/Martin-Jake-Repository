package com.revature.objects;

import java.io.File;
import java.sql.Blob;
import java.util.UUID;

public class Attatchment {

	private String ATTATCHMENT_ID;
	private File BLOB;
	private String TR_FORM_ID;
	
	public Attatchment(File bLOB, String tR_FORM_ID) {
		super();
		ATTATCHMENT_ID = UUID.randomUUID().toString();
		BLOB = bLOB;
		TR_FORM_ID = tR_FORM_ID;
	}

	@Override
	public String toString() {
		return "Attatchment [ATTATCHMENT_ID=" + ATTATCHMENT_ID + ", TR_FORM_ID=" + TR_FORM_ID + "]";
	}

	public String getATTATCHMENT_ID() {
		return ATTATCHMENT_ID;
	}

	public void setATTATCHMENT_ID(String aTTATCHMENT_ID) {
		ATTATCHMENT_ID = aTTATCHMENT_ID;
	}

	public File getBLOB() {
		return BLOB;
	}

	public void setBLOB(File bLOB) {
		BLOB = bLOB;
	}

	public String getTR_FORM_ID() {
		return TR_FORM_ID;
	}

	public void setTR_FORM_ID(String tR_FORM_ID) {
		TR_FORM_ID = tR_FORM_ID;
	}
	
	
}

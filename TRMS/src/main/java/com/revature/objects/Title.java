package com.revature.objects;

public class Title {

	
	private int TITLE_ID;
	private String TITLE_DESCRIPTION;
	
	public Title(){}

	public Title(int tITLE_ID, String tITLE_DESCRIPTION) {
		super();
		TITLE_ID = tITLE_ID;
		TITLE_DESCRIPTION = tITLE_DESCRIPTION;
	}

	@Override
	public String toString() {
		return "Title [TITLE_ID=" + TITLE_ID + ", TITLE_DESCRIPTION=" + TITLE_DESCRIPTION + "]";
	}

	public int getTITLE_ID() {
		return TITLE_ID;
	}

	public void setTITLE_ID(int tITLE_ID) {
		TITLE_ID = tITLE_ID;
	}

	public String getTITLE_DESCRIPTION() {
		return TITLE_DESCRIPTION;
	}

	public void setTITLE_DESCRIPTION(String tITLE_DESCRIPTION) {
		TITLE_DESCRIPTION = tITLE_DESCRIPTION;
	}
	
	
	
	
}

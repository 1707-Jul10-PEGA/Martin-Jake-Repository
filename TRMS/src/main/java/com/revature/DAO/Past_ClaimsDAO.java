package com.revature.DAO;

import java.util.List;

import com.revature.objects.Past_Claims;

public interface Past_ClaimsDAO {

	public List<Past_Claims> getAllPast_Claims();

	public Past_Claims getPast_Claims(String PCid);

	public void addPast_Claims(Past_Claims pc);

	public void updatePast_Claims(String pcID, Past_Claims pc);

	public void deletePast_Claims(String pcID);
	
}

package com.revature.DAO;

import java.util.List;

import com.revature.objects.TR_Form;

public interface TR_FormDAO {

	
	public List<TR_Form> getAllTR_Forms();

	public TR_Form getTR_Form(String tr_formid);

	public void addTR_Form(TR_Form t);

	public void updateTR_Form(String TR_FormID, TR_Form tr);

	public void deleteTR_Form(String TR_FormID);
	
}

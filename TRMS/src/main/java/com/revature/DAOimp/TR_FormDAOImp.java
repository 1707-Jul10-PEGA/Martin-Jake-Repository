package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.TR_FormDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;
import com.revature.objects.TR_Form;

public class TR_FormDAOImp implements TR_FormDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public TR_FormDAOImp() {
		super();
		
		setup();
		
	}
	
	@Override
	public List<TR_Form> getAllTR_Forms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR_Form getTR_Form(String tr_formid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTR_Form(TR_Form t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTR_Form(String TR_FormID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTR_Form(String TR_FormID) {
		// TODO Auto-generated method stub

	}
	
	public List<TR_Form> getAllTR_FormsByUserId(String userid) {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM TR WHERE EMPLOYEE_ID = '"+userid+"'";
		Statement statement = null;

		List<TR_Form> al = new ArrayList<TR_Form>();
		
		try {
					
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
		
			while (rs.next()) {
				TR_Form form = new TR_Form();
				form.setTR_ID(rs.getString("TR_ID"));
				form.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				form.setDATE_CREATED(rs.getString("TR_DATE_CREATED"));
				form.setEVENT_ID(rs.getString("EVENT_ID"));
				form.setREQUIRES_MORE_INFO(Integer.parseInt(rs.getString("REQUIRES_MORE_INFO")));
				form.setREIMBURSEMENT_ID(rs.getString("REIMBURSEMENT_ID"));
				form.setAPPROVAL_STATUS(Integer.parseInt(rs.getString("APPROVAL_STATUS")));
				form.setFINAL_GRADE(rs.getString("FINAL_GRADE"));
			
				al.add(form);

			}
			return al;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}

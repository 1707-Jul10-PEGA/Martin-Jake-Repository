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
	
	@Override
	public List<TR_Form> getAllTR_Forms() {
		conn = cf.getConnection();
		String sql = "SELECT * FROM TR";
		Statement s;

		List<TR_Form> al = new ArrayList<TR_Form>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				TR_Form ap = new TR_Form(rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getString(8));
				ap.setTR_ID(rs.getString(1));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public TR_Form getTR_Form(String tr_formid) {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM TR WHERE TR_ID=?";
		TR_Form ap = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tr_formid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new TR_Form(rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getString(8));
				ap.setTR_ID(rs.getString(1));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
		
	}

	@Override
	public void addTR_Form(TR_Form emp) {
		conn = cf.getConnection();
		String sql = "INSERT INTO TR (TR_id, employee_id,tr_date_created, event_id,requires_more_info, reimbursement_id, approval_status, final_grade) VALUES (?,?,?,?,?,?,?,?)";

		try {
			
			java.sql.Date sqlDate = java.sql.Date.valueOf(emp.getDATE_CREATED());
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getTR_ID());
			ps.setString(2, emp.getEMPLOYEE_ID());
			ps.setDate(3, sqlDate);
			ps.setString(4, emp.getEVENT_ID());
			ps.setInt(5, emp.getREQUIRES_MORE_INFO());
			ps.setString(6, emp.getREIMBURSEMENT_ID());
			ps.setInt(7, emp.getAPPROVAL_STATUS());
			ps.setString(8, emp.getFINAL_GRADE());
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	public void updateTR_Form(String TR_FormID, TR_Form tr) {
		
		conn = cf.getConnection();
		String sql = "UPDATE TR SET " + "TR_id=?, employee_id=?,tr_date_created=?, event_id=?,requires_more_info=?, reimbursement_id=?, approval_status=?, final_grade=?" + "WHERE tr_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tr.getTR_ID());
			ps.setString(2, tr.getEMPLOYEE_ID());
			ps.setString(3, tr.getDATE_CREATED());
			ps.setString(4, tr.getEVENT_ID());
			ps.setInt(5, tr.getREQUIRES_MORE_INFO());
			ps.setString(6, tr.getREIMBURSEMENT_ID());
			ps.setInt(7, tr.getAPPROVAL_STATUS());
			ps.setString(8, tr.getFINAL_GRADE());
			
			ps.setString(9, TR_FormID);
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
		

	}
	
public void setTRStatusDeleted(String id) {
		
		conn = cf.getConnection();
		String sql = "UPDATE TR SET " + "approval_status=? WHERE TR_ID = ?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, 7);
			ps.setString(2, id);
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
		

	}

	@Override
	public void deleteTR_Form(String TR_FormID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTR_Form(String TR_FormID) {
		// TODO Auto-generated method stub
		
	}

}

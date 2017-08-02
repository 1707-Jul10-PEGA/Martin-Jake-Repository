package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.DAO.EmployeeDAO;
import com.revature.database.ConnectionFactory;
import com.revature.objects.Employee;

public class EmployeeDAOImp implements EmployeeDAO {

	Connection conn = null;
	ResultSet rs = null;
	ConnectionFactory cf = null;
	
	public void setup(){
		cf = ConnectionFactory.getInstance();
	}

	public EmployeeDAOImp() {
		super();
		setup();

	}

	
	public Employee searchEmpsByUsername(List<Employee> emplist, String username){
		
		for(Employee emp: emplist){
			if(emp.getUSERNAME().equals(username)){
				return emp;
			}
		}
		
		return null;
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM Employee";
		Statement s;

		List<Employee> al = new ArrayList<Employee>();

		try {
			s = conn.createStatement();
			rs = s.executeQuery(sql);

			while (rs.next()) {
				Employee ap = new Employee(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getString(8));
				ap.setEMPLOYEE_ID(rs.getString(1));
				al.add(ap);

			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return al;
	}

	@Override
	public Employee getEmployee(String empid) {
		conn = cf.getConnection();
		String sql = "SELECT * FROM Employee WHERE Employee_ID=?";
		Employee ap = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, empid);
			rs = ps.executeQuery();

			while (rs.next()) {
				ap = new Employee(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getString(8));
				ap.setEMPLOYEE_ID(rs.getString(1));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ap;
	}

	@Override
	public void addEmployee(Employee emp) {
	
		
		conn = cf.getConnection();
		String sql = "INSERT INTO Employee (Employee_id, username,pass_word, F_name,L_name, Ben_co_member, Supervised_by) VALUES (?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getEMPLOYEE_ID());
			ps.setString(2, emp.getUSERNAME());
			ps.setString(3, emp.getPASS_WORD());
			ps.setString(4, emp.getFNAME());
			ps.setString(5, emp.getLNAME());
			ps.setInt(6, emp.getBEN_CO_MEMBER());
			ps.setString(7, emp.getSUPERVISED_BY());
			ps.executeUpdate();
			

		} catch (SQLException e) {
		
			e.printStackTrace();
		}


	}

	@Override
	public void updateEmployee(String empID, Employee emp) {
		conn = cf.getConnection();
		String sql = "UPDATE Employee SET " + "Employee_id=?, username=?,pass_word=?, F_name=?,L_name=?, Ben_co_member=?, Supervised_by=?" + "WHERE employee_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getEMPLOYEE_ID());
			ps.setString(2, emp.getUSERNAME());
			ps.setString(3, emp.getPASS_WORD());
			ps.setString(4, emp.getFNAME());
			ps.setString(5, emp.getLNAME());
			ps.setInt(6, emp.getBEN_CO_MEMBER());
			ps.setString(7, emp.getSUPERVISED_BY());
			ps.setString(8, empID);
			
			ps.executeUpdate();
		

		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployee(String empID) {
		// TODO Auto-generated method stub

	}

}

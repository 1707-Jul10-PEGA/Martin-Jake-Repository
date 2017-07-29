package com.revature.DAOimp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		conn = cf.getConnection();
		String sql = "SELECT * FROM EMPLOYEE";
		Statement s ;
		
		try {
			s= conn.createStatement();
			rs = s.executeQuery(sql);
			if(rs.next()){
			System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Employee getEmployee(String empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(String empID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(String empID) {
		// TODO Auto-generated method stub

	}

}

package com.revature.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.objects.Employee;

public interface EmployeeDAO {

	
	public List<Employee> getAllEmployees() throws SQLException;	
	
	public Employee getEmployee(String empid)  throws SQLException;
	
	public void addEmployee(Employee emp)  throws SQLException;
	
	public void updateEmployee(String empID, Employee emp);
	
	public void deleteEmployee(String empID);
	
}

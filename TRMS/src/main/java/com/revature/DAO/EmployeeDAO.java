package com.revature.DAO;

import java.sql.SQLException;
import java.util.List;

import com.revature.objects.Employee;

public interface EmployeeDAO {

	
	public List<Employee> getAllEmployees() throws SQLException;	
	
	public Employee getEmployee(String empid)  throws SQLException;
	
	public void addEmployee(Employee emp)  throws SQLException;
	
<<<<<<< HEAD
	public void updateEmployee(String empID)  throws SQLException;
=======
	public void updateEmployee(String empID, Employee emp);
>>>>>>> 90e1f104d077ef9c012bc0b00b1d6ba3d94cbb20
	
	public void deleteEmployee(String empID)  throws SQLException;
	
}

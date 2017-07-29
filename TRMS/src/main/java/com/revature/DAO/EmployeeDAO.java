package com.revature.DAO;

import java.util.List;

import com.revature.objects.Employee;

public interface EmployeeDAO {

	
	public List<Employee> getAllEmployees();	
	
	public Employee getEmployee(String empid);
	
	public void addEmployee(Employee emp);
	
	public void updateEmployee(String empID);
	
	public void deleteEmployee(String empID);
	
}

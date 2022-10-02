package com.masai.dao;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeDTO;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {
  
	public String registerEmployee(int eid,String sname,String email,String password);

	public String registerDepartment(int did,String dname);
	
	public Employee getEmployeeById(int roll)throws EmployeeException;

	public String updateDepartment(int did,String dname);
	
	public String leaves(int eid,String sname,String email,int leaves6);
	
	public Employee loginEmployee(String username, String password)throws EmployeeException;
	
	
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	
	
	public String registerEmployeeInsideACourse(int cid, int roll)throws EmployeeException,DepartmentException ;
	
	public List<EmployeeDTO> getAllEmployeesByCname(String cname)throws DepartmentException;
	
	
	
}

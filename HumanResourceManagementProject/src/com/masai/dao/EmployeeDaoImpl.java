package com.masai.dao;

import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Employee;
import com.masai.bean.EmployeeDTO;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String registerEmployee(int eid,String ename,  String email, String password) {
	
		String message = "Not Inserted..";
	
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into employee(eid,ename,email,password) values(?,?)");
					
			ps.setInt(1, eid);
			ps.setString(2, ename);
			ps.setString(3, email);
			ps.setString(4, password);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Employee Registered Sucessfully !";
			
				
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}
	
	
	public String registerDepartment(int did,String dname) {
		
		String message = "Not Inserted..";
	
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into department(did,dname) values(?,?)");
					
			ps.setInt(1, did);
			ps.setString(2, dname);
			
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Department Registered Sucessfully !";
			
				
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}
	
	
	public String updateEmployee(int eid1,String ename1,  String email1, String password1) {
		
		String message = "Not Inserted..";
	
		try(Connection conn= DBUtil.provideConnection()) {
			
			System.out.println("Enter Employee ID:");
			
			PreparedStatement ps= conn.prepareStatement
					("update employee SET eid=eid1,ename=ename1,email=email1,password=password1 WHERE eid=eid1");
					
			ps.setInt(1, eid1);
			ps.setString(2, ename1);
			
			ps.setString(3, email1);
			ps.setString(4, password1);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Employee Updated Sucessfully !";
			
				
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}

	
	public String leaves(int eid,String ename,  String email, int leaves) {
		
		String message = "Not Inserted..";
	
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into leaves(eid,ename,email,leaves) values(?,?)");
					
			ps.setInt(1, eid);
			ps.setString(2, ename);
			
			ps.setString(3, email);
			ps.setInt(4, leaves);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Leaves given Sucessfully !";
			
				
		} catch (SQLException e) {
			message = e.getMessage();
		}

		return message;
	}
	
	@Override
	public Employee getEmployeeById(int id)throws EmployeeException {
	
		Employee employee =null;
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where eid=?");
			
			
			ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String e= rs.getString("email");
				String p= rs.getString("password");
				
				
			employee=new Employee(r, n, e, p);	
				
				
			}else
				throw new EmployeeException("Employee does not exist with Id "+id);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			throw new EmployeeException(e.getMessage());
			
			
		}

		return employee;
	
	}

	@Override
	public Employee loginEmployee(String username, String password) throws EmployeeException {
		
		
		Employee employee = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where email = ? AND password = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				
				int r= rs.getInt("eid");
				String n= rs.getString("name");
				String e= rs.getString("email");
				String p= rs.getString("password");
				
				
			employee=new Employee(r, n, e, p);	
				
				
			}else
				throw new EmployeeException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
	
		return employee;
		
		
	}


	@Override
	public String updateDepartment(int did, String dname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String registerEmployeeInsideACourse(int cid, int roll) throws EmployeeException, DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EmployeeDTO> getAllEmployeesByCname(String cname) throws DepartmentException {
		// TODO Auto-generated method stub
		return null;
	}}

//	@Override
//	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
//		
//		List<Employee> employees= new ArrayList<>();
//		
//		
//		try(Connection conn= DBUtil.provideConnection()) {
//			
//			PreparedStatement ps= conn.prepareStatement("select * from employee");
//			
//			
//			
//			ResultSet rs= ps.executeQuery();
//			
//			while(rs.next()) {
//				
//				
//				int r= rs.getInt("roll");
//				String n= rs.getString("name");
//				int m= rs.getInt("marks");
//				String e= rs.getString("email");
//				String p= rs.getString("password");
//				
//				
//			Employee employee=new Employee(r, n, m, e, p);	
//				
//			employees.add(employee);
//	 		
//			}
//			
//	  	
//		} catch (SQLException e) {
//			throw new EmployeeException(e.getMessage());
//		}
//		
//		
//		if(employees.size() == 0)
//			throw new EmployeeException("No Employee found..");
//	 
//		return employees;
//	}

//	@Override
//	public String registerEmployeeInsideACourse(int cid, int roll) throws EmployeeException, CourseException {
//		
//			String message ="Not Resgistered";
//	
//	
//			try(Connection conn= DBUtil.provideConnection()) {
//				
//			 	PreparedStatement ps= conn.prepareStatement("select * from employee where roll =?");
//				
//			 	
//			 	ps.setInt(1, roll);
//			 	
//			 	ResultSet rs= ps.executeQuery();
//				
//			 	if(rs.next()) {
//			 		
//			 		PreparedStatement ps2= conn.prepareStatement("select * from course where cid=?");
//			 		
//			 		ps2.setInt(1, cid);
//
//			 		ResultSet rs2= ps2.executeQuery();
//			 		
//			 		if(rs2.next()) {
//			 			
//	
//			 			PreparedStatement ps3= conn.prepareStatement("insert into course_employee values(?,?)");
//			 			
//			 			
//			 			ps3.setInt(1, cid);
//			 			ps3.setInt(2, roll);
//			 			
//			 			int x= ps3.executeUpdate();
//			 			
//			 			if(x > 0)
//			 				message = "Employee registered inside the Course Sucessfully.. ";
//			 			else
//			 				throw new EmployeeException("Techical error..");
//			 	
//			 		}
//			 		else
//			 			throw new CourseException("Invalid Course...");
//	  		
//			 	}else
//			 		throw new EmployeeException("Invalid Employee...");
//	 	
//			} catch (SQLException e) {
//				throw new EmployeeException(e.getMessage());
//			}
//	 
//			return message;
//	}

//	@Override
//	public List<EmployeeDTO> getAllEmployeesByCname(String cname) throws CourseException {
//		
//		
//		List<EmployeeDTO> dtos = new ArrayList<>();
//		
//		
//		
//		try (Connection conn = DBUtil.provideConnection()){
//			
//			PreparedStatement ps= conn.prepareStatement("select s.roll, s.name,s.email, c.cname, c.fee "
//														+ "from  employee s INNER JOIN course c INNER JOIN course_employee cs "
//														+ "ON s.roll = cs.roll AND c.cid = cs.cid AND c.cname= ?");
//			
//			ps.setString(1, cname);
//			
//			ResultSet rs= ps.executeQuery();
//			
//			while(rs.next()) {
//				
//				int r= rs.getInt("roll");
//				String sn= rs.getString("name");
//				String em= rs.getString("email");
//				
//				String cn= rs.getString("cname");
//				int f= rs.getInt("fee");
//				
//				EmployeeDTO dto = new EmployeeDTO(r, sn, em, cn, f);
//				
//				dtos.add(dto);
//		 	
//			}
//	 
//		} catch (SQLException e) {
//			throw new CourseException(e.getMessage());
//		}
//	 
//		if(dtos.isEmpty())
//			throw new CourseException("No Employee found in that course");
//		 
//		return dtos;
//		
//	}
//
//}

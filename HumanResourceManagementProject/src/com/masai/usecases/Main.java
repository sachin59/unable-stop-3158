package com.masai.usecases;
import java.util.List;
import java.util.Scanner;
import com.masai.bean.Employee;
import com.masai.bean.EmployeeDTO;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

		public class Main {
			
				public static void main(String[] args) {
				
					 System.out.println("Please choose from the following options");
					 System.out.println("1. Login as admin");
					 System.out.println("2. Login as Employee");
					
					 Scanner sc= new Scanner(System.in);
						int x= sc.nextInt();
				        switch (x) {
				     
				        // If x == 1
				        case 1:
				     
				        	 System.out.println("Please choose from the following options");
							 System.out.println("1. Register a new Employee");
							 System.out.println("2. Add a new Department");
							 System.out.println("3. View a Department");
							 System.out.println("4. Update a Department");
							 System.out.println("5. Transfer Employee to other Department");
							 System.out.println("6. Employee Leave Request");
							 
							 
								int y= sc.nextInt();
						    
				     
				            switch (y) {
				     
				            
				            case 1:
				                System.out.println("Choice is 1");
				            	System.out.println("Enter Employee ID:");
								int eid= sc.nextInt();
								
								System.out.println("Enter Employee Name:");
								String ename= sc.next();
								
								System.out.println("Enter Employee Email:");
								String email= sc.next();
								
								System.out.println("Enter Employee password:");
								String password= sc.next();
								
								
								EmployeeDao dao=new EmployeeDaoImpl();
								
								String result= dao.registerEmployee(eid, ename, email, password);
								
								System.out.println(result);
				                break;
				     
				            
				            case 2:
				                System.out.println("Choice is 2");
				                 
				            	System.out.println("Enter Employee ID:");
								int did= sc.nextInt();
								
								System.out.println("Enter Employee Name:");
								String dname= sc.next();
								
								
								EmployeeDao dao2=new EmployeeDaoImpl();
								
								String result2= dao2.registerDepartment(did, dname);
								
								System.out.println(result2);
				                break;
				     
				          
				                
				            case 3:
//				                
//				                System.out.println("Enter the Department Name");
//				        		
//				        		String cname= sc.next();
//
//				        		
//				        		EmployeeDao dao2 = new EmployeeDaoImpl();
//				        		
//				        		try {
//				        		List<EmployeeDTO> dtos= dao.getAllEmployeesBydname(dname);
//				        		
//				        		dtos.forEach(dto -> System.out.println(dto));
//				        		
//				        		
//				        		}catch (Exception e) {
//				        			System.out.println(e.getMessage());
//				        		}
//				                break;
				     
				            
				            case 4:
				                System.out.println("Choice is 4");
				                break;
				                
				            case 5:
//				                System.out.println("Choice is 5");
//				                System.out.println("Enter the cid");
//				        		int cid= sc.nextInt();
//
//				        		System.out.println("Enter the roll");
//				        		int roll= sc.nextInt();
//				          
//				        		EmployeeDao dao5 = new EmployeeDaoImpl();
//				        		
//				        		try {
//				        		String result2 = dao.registerEmployeeInsideADepartment(cid, roll);
//				        		
//				        		System.out.println(result2);
//				        		}catch(Exception e) {
//				        			
//				        			System.out.println(e.getMessage());
//				        			
//				        		}
//				                break;
				     
				           
				            case 6:
				                System.out.println("Choice is 6");
				                 
				            	System.out.println("Enter Employee ID:");
								int eid6= sc.nextInt();
								
								System.out.println("Enter Employee Name:");
								String ename6= sc.next();
								
								System.out.println("Enter Employee Email:");
								String email6= sc.next();
								
								System.out.println("Enter number of leaves:");
								int leaves6= sc.nextInt();
								
								EmployeeDao dao6=new EmployeeDaoImpl();
								
								String result6= dao6.leaves(eid6, ename6, email6,leaves6);
								
								System.out.println(result6);
				                
				                break;
				            }
				            break;
				     
				       
				        case 2:
				        	
				    		System.out.println("Enter Username:");
				    		String uname = sc.next();
				    		
				    		System.out.println("Enter Password:");
				    		String pass = sc.next();
				    		
				    		EmployeeDao dao = new EmployeeDaoImpl();
				    		
				    		try {
				    			Employee employee= dao.loginEmployee(uname, pass);
				    		
				    	 		System.out.println("Welcome Student :"+employee.getName());
				    	 	
				    	 	
				    		}catch (EmployeeException e) {
				    			System.out.println(e.getMessage());
				    		}
				     
				            
				        	 System.out.println("Please choose from the following options");
							 System.out.println("1. View Employee Profile");
							 System.out.println("2. Update Emplyee Profile");
							 System.out.println("3. Request for leaves");
							 
							int z= sc.nextInt();
						    
				            switch (z) {
				     
				            
				            case 1:
				                System.out.println("Choice is 1");
				                System.out.println("Enter Employee ID:");
				        		int id= sc.nextInt();
				        		
				        		
				        		EmployeeDao dao3= new EmployeeDaoImpl();
				        		
				        		try {
				        			Employee student= dao.getEmployeeById(id);
				        		
				        			System.out.println(student);
				        		
				        		}catch (EmployeeException se) {
				        			System.out.println(se.getMessage());
				        		}
				                break;
				      
				            case 2:
				                System.out.println("Choice is 2");
				                 
				            	System.out.println("Enter Employee ID:");
								int eid= sc.nextInt();
								
								System.out.println("Enter Employee Name:");
								String ename= sc.next();
								
								System.out.println("Enter Employee Email:");
								String email= sc.next();
								
								System.out.println("Enter Employee password:");
								String password= sc.next();
								
								
								EmployeeDao dao4=new EmployeeDaoImpl();
								
								String result= dao4.registerEmployee(eid, ename, email, password);
								
								System.out.println(result);
				                break;
				                
				                
				              
				                
				                
				            case 3:
				                System.out.println("Choice is 3");
				                System.out.println("Enter Employee ID:");
								int eid6= sc.nextInt();
								
								System.out.println("Enter Employee Name:");
								String ename6= sc.next();
								
								System.out.println("Enter Employee Email:");
								String email6= sc.next();
								
								System.out.println("Enter number of leaves:");
								int leaves6= sc.nextInt();
								
								EmployeeDao dao6=new EmployeeDaoImpl();
								
								String result6= dao.leaves(eid6, ename6, email6,leaves6);
								
								System.out.println(result6);
				                
				                break;
				               
				            }
				            break;
				       
				            
				        	
				        default:
				            System.out.println("Please select from option 1 or 2");
				            break;
				        }
				}
				}
					

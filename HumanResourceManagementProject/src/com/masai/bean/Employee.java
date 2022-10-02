package com.masai.bean;

public class Employee {
	
	private int eid;
	private String name;
	private String email;
	private String password;
	
	public Employee() {
		 
	}

	public Employee(int eid, String name, String email, String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getid() {
		return eid;
	}

	public void setId(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [Employee Id=" + eid + ", name=" + name + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}

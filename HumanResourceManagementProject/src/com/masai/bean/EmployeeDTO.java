package com.masai.bean;

public class EmployeeDTO {

	private int eid;
	private String name;
	private String email;
	
	public EmployeeDTO() {
		 
	}

	public EmployeeDTO(int eid, String name, String email) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
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

		@Override
	public String toString() {
		return "EmployeeDTO [Employee Id=" + eid + ", name=" + name + ", email=" + email +"]";
	}
	
	
	
	
	
}

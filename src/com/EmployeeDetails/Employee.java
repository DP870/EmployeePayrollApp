package com.EmployeeDetails;

public class Employee {
	private String empId;
	private String name;
	private String email;
	private String pass;

	
	
	public Employee(String empId,String name, String email,String password) {
		this.empId=empId;
		this.name=name;
		this.email=email;
		this.pass=Hash.hash(password);
		}

	

	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
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



	public String getPass() { return pass; }


	public void setPass(String pass) {
		this.pass = Hash.hash(pass);
	}



	
	
}

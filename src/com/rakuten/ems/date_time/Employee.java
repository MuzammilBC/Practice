package com.rakuten.ems.date_time;

public class Employee {
	
	String empname;
	int empid;
	double salary;
	String designation;
	String department;
	String empaddress;
	long mobileno;
	String dob;
	String doj;
	
	
	
	public Employee(String empname, int empid, double salary, String designation, String department, String empaddress,
			long mobileno, String dob, String doj) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.empaddress = empaddress;
		this.mobileno = mobileno;
		this.dob = dob;
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		return this.empname+"|"+this.empid+"|"+this.salary+"|"+this.designation+"|"+
	this.department+"|"+this.empaddress+"|"+
	this.mobileno+"|"+this.dob+"|"+this.doj;
		
	}

}

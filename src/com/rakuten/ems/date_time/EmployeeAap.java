package com.rakuten.ems.date_time;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAap {
	
	    
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee5> employees = new ArrayList<>();

	        for (int i = 1; i <= 3; i++) {
	            System.out.println("Enter Employee " + i + " details:");
	            System.out.print("Employee ID: ");
	            int eid = sc.nextInt();
	            System.out.print("Employee Name: ");
	            String ename = sc.next();

	            System.out.println("Enter Department details:");
	            System.out.print("Department ID: ");
	            int did = sc.nextInt();
	            System.out.print("Department Name: ");
	            String dname = sc.next();
	            System.out.print("Designation: ");
	            String designation = sc.next();

	            Department department = new Department(did, dname, designation);
	            Employee5 employee = new Employee5(eid, ename, department);
	            
	            employees.add(employee);
	        }

	        System.out.println("Employee details:");
	        for (Employee5 employee : employees) {
	        	System.out.println("Employee ID: " + employee.getEid());
	            System.out.println("Employee Name: " + employee.getEname());
	            System.out.println("Department ID: " + employee.getDepartment().getDid());
	            System.out.println("Department Name: " + employee.getDepartment().getDname());
	            System.out.println("Designation: " + employee.getDepartment().getDesignation());
	            System.out.println();
	        }
	    }
	}
	        

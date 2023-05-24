package rakuten_SS;
import java.util.Scanner;

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



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String empname = scan.next();
		System.out.println("Enter Employee Id: ");
		int empid = scan.nextInt();
		System.out.println("Enter Employee Designation: ");
		String desig = scan.next();
		System.out.println("Enter Employee Salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter Employee Department: ");
		String dept = scan.next();
		System.out.println("Enter Employee Mobile No: ");
		long mobile = scan.nextLong();
		System.out.println("Enter Employee Address: ");
		String address= scan.next();
		System.out.println("Enter Employee Date of Birth: ");
		String dob = scan.next();
		System.out.println("Enter Employee Date of Joining: ");
		String doj = scan.next();
		
		Employee e = new Employee(empname, empid, sal, desig, dept, address, mobile, dob, doj);		
		System.out.println("Employee Data:");
		System.out.println("Enter Employee Name: " + e.empname);
		System.out.println("Enter Employee Id: " + e.empid);
		System.out.println("Enter Employee Designation: "+ e.designation);
		System.out.println("Enter Employee Salary: "+e.salary);
		System.out.println("Enter Employee Department: "+e.department);
		System.out.println("Enter Employee Mobile No: "+e.mobileno);
		System.out.println("Enter Employee Address: "+e.empaddress);
		System.out.println("Enter Employee Date of Birth: "+e.dob);
		System.out.println("Enter Employee Date of Joining: "+e.doj);
		
	}
}

package rakuten_SS;


public class Employee2 {
	String Name,Designation;
	int ID;
	double Salary;


	public Employee2(int ID,String name, String designation,double Salary) {
		Name = name;
		Designation = designation;
		this.ID=ID;
		this.Salary=Salary;
		System.out.println("-----------------------------------------------------------");
		System.out.println("ID\t\tName\t\tDesignation\t\tSalary");
		System.out.println("-----------------------------------------------------------");

	}
     
	
	@Override
	public String toString() {

		return this.ID+"\t\t"+this.Name +"\t\t"+ this.Designation+"\t\t"+this.Salary+"/n------------------------------------------------------------------";

	}


	public static void main(String[] args) {
		Employee2 e1=new Employee2(12,"Muzammil","manager",57600.00);
		System.out.println(e1);
		Employee2 e2=new Employee2(10,"manu","CEO",57600.00);
		System.out.println(e2);

	}




}



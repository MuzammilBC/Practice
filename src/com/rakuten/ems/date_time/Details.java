package com.rakuten.ems.date_time;

public class Details<T> {
	
	Details(T value){
		System.out.println(value);
	}

	public static void main(String[] args) {
    Employee e=new Employee("Muzammil", 23, 6778, "Developer", "doftware development","belagavi", 24, "03-04=2023", "03-04-2023");
    Details<Employee> d=new Details<Employee>(e);

    Students s=new Students("Muzammil", 24, "class A", "Bangalore");
    Details<Students> dt=new Details<Students>(s);
    
	}

}



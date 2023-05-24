package com.rakuten.ems.date_time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		ArrayList<Aryl_Employee> emplist=new ArrayList<Aryl_Employee>();
		emplist.add(new Aryl_Employee(10,"Jay",45));
		emplist.add(new Aryl_Employee(15,"Ajay",25));
		emplist.add(new Aryl_Employee(16,"Vijay",35));
		
		Collections.sort(emplist,new AgeComparator() );
		
		Iterator<Aryl_Employee> itr=emplist.iterator();
		while(itr.hasNext()) {
			Aryl_Employee e=(Aryl_Employee)itr.next();
			System.out.println(e.rollno+"|"+e.name+"|"+e.age);
		}
		System.out.println();
	Collections.sort(emplist,new NameComparator());
	Iterator<Aryl_Employee> itr_name=emplist.iterator();
	while(itr_name.hasNext()) {
		Aryl_Employee e=(Aryl_Employee)itr_name.next();
		System.out.println(e.rollno+"|"+e.name+"|"+e.age);
	}
		
	}

}

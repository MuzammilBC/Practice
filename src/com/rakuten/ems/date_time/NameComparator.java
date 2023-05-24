package com.rakuten.ems.date_time;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{
	
	@Override
	public int compare(Object obj_1, Object obj_2) {
		Aryl_Employee e1=(Aryl_Employee)obj_1;
		Aryl_Employee e2=(Aryl_Employee)obj_2;
		return e1.name.compareTo(e2.name);
	}
	
	

}

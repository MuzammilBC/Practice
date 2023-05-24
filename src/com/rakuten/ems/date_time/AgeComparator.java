package com.rakuten.ems.date_time;

import java.util.Comparator;



public class AgeComparator implements Comparator<Object> {
	
	@Override
	public int compare(Object Obj_1, Object obj_2) {
		Aryl_Employee e1=(Aryl_Employee)Obj_1;
		Aryl_Employee e2=(Aryl_Employee)obj_2;
		if(e1.age==e2.age) {
		return 0;
	}
		else if(e1.age>e2.age) {
			return 1;
		}
		else {
			return -1;
		}
}
}

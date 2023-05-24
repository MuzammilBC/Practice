package com.rakuten.ems.date_time;

import java.util.ArrayList;

public class Array_List {
public static void main(String[] args) {
	

	ArrayList<Integer> alint = new ArrayList<Integer>(50);
	
	for(int i=0;i<20;i++) {
		alint.add(i);
	}
	System.out.println(alint);
	
	ArrayList alist = new ArrayList();
	alist.addAll(alint);	// added first 20 elements from alint ArrayList,
							//ie, 0 to 19 index values
							//then adding new elements to alist as below
	alist.add("muzzamil");  //index 20
	alist.add("manu");	    //index 21
	alist.add("sachin");   //index 22
	
	System.out.println(alist.get(22));
	System.out.println(alist.get(23));// index out of bounds since value at index 
										//	at 23 is not there.
}

}


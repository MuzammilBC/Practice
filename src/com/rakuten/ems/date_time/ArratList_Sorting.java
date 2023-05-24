package com.rakuten.ems.date_time;

import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.processing.SupportedSourceVersion;

public class ArratList_Sorting {

	public static void main(String[] args) {
    
		ArrayList<String> al=new ArrayList<String>();
		al.add("Jeyapaul");
		al.add("Abinaya");
		al.add("Muttu");
		al.add("Manu");
		al.add("Muzammil");
		
		//Array String sort and reverse order
		System.out.println("Array list before sorting ");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("arraylist after sorting");
		System.out.println(al);
		System.out.println("displaying array list with rerverse order");
		Collections.reverse(al);
		System.out.println(al);
		
		
		
		//Array Integer sort and reverse order 
		System.out.println();
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(45);alist.add(32);alist.add(423);alist.add(54);alist.add(9);alist.add(434);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
	    System.out.println("sorting the array in reverse order");
	    Collections.sort(alist,Collections.reverseOrder());
	    System.out.println(alist);
		
	}

}

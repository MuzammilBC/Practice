package com.rakuten.ems.date_time;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_2 {

	public static void main(String[] args) {
		Bookss b=new Bookss(null);
		Map<Integer,Bookss> libry=new HashMap<Integer,Bookss>();
		libry.put(10, new Bookss("sql"));
		libry.put(10, new Bookss("HTML"));
		libry.put(10, new Bookss("SpringBOOT"));
		libry.put(10, new Bookss("MicroSevicess"));
		
		
		//Way:1 Printing the Map Directly
		System.out.println(libry);
		
		//Way:2 Iterrating throw entry set
		for(Map.Entry<Integer,Bookss> m:libry.entrySet()) {
			System.out.println(m.getKey()+"->"+m.getValue());
		}
		System.out.println();
		//Way:3 Iterating through key set and values
		System.out.println("printing keys");
		for(Integer k:libry.keySet()) {
			System.out.println("Keys =:"+k);
		}
			System.out.println();
		System.out.println("Printing values");
		for(Bookss S:libry.values()) {
			System.out.println("values =:"+S);
		}
		
		//Way 4:Iterating through iterator 
		Iterator<Entry<Integer, Bookss>> itr=libry.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, Bookss> e=itr.next();
			
			//System.out.println(itr.next());
			
			System.out.println("key :"+e.getKey()+"value :"+e.getValue());
		}
		System.out.println();
		System.out.println(".forEach");
		//Way :4 Iterating through .forEach() Method
		libry.forEach((k,v)->System.out.println("key="+k+"value"+v));

	    
	    
	
	}
	
	


	}


	
		
	


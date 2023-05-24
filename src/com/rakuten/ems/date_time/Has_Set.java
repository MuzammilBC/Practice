package com.rakuten.ems.date_time;

import java.util.HashSet;
import java.util.Iterator;

public class Has_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("hitlerwomen");
		hs.add("motherinlaw");
		hs.add("Sachin");
		hs.add("ganguly");
		hs.add("kohili");
		hs.add("dhoni");
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.contains("dhoni"));
		
		
		/*There is no get method in the Hash_set 
		 * so we can't use the for loop and get() 
		for(int i=0;i<hs.size();i++) {
			System.out.println(hs.get(i));
		}*/
		
		for(String s:hs) {
			System.out.println(s);
		}
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

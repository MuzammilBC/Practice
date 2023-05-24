package com.rakuten.ems.date_time;

public class Desk {
	
	static class Repeat{
		String name="soujanya";
		static int marks =99;
		
		void sleep()
		{System.out.println(name+"Sleep");
		System.out.println(marks);
		}
		static void dontsleep() {
			Repeat r= new Repeat();
			System.out.println(r.name+"enough of sleeping concentrate ");
			System.out.println("if you keep sleeping ,i will reduce your marks from" +marks+"00");
		}
	}

}

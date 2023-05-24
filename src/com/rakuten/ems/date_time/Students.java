package com.rakuten.ems.date_time;

public class Students {
	
		String name;
		int rollno;
		String Class;
		String city;
		
		Students(String stuname, int roll,String Class, String cty){
			name = stuname;
			rollno = roll;
			Class=Class;
			city = cty;
		}
		@Override
		public String toString() {
		
		return this.name+"|"+this.rollno+"|"+this.Class+"|"+this.city;
		
		}

}

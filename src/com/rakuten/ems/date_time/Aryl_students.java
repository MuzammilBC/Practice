package com.rakuten.ems.date_time;

import java.util.ArrayList;
import java.util.Collections;

public class Aryl_students implements Comparable<Aryl_students> {
	int rollno;
	String name;
	int age;
	
	public Aryl_students(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Aryl_students o) {
		// TODO Auto-generated method stub
		
		if(this.age==o.age) {
		return 0;
	}
		else if(this.age>o.age) {
			return 1;
		}
		else {
			return -1;
	
		
		}
			
	}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.rollno+" "+this.name+""+this.age;
		}
		

	public static void main(String[] args) {
		ArrayList<Aryl_students> al=new ArrayList<Aryl_students>();
		al.add(new Aryl_students(1001,"Muthu",38));
		al.add(new Aryl_students(1001,"Muzammil",25));
		al.add(new Aryl_students(1001,"Jeyapaul",26));
		al.add(new Aryl_students(1001,"Manu",88));
		al.add(new Aryl_students(1001,"Rahul",12));
		Collections.sort(al);
		
		for(Aryl_students s:al) {
			System.out.println(s.rollno+""+s.name+""+s.age);
		}
	}
	

	}

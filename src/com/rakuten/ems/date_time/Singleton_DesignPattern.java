package com.rakuten.ems.date_time;

public class Singleton_DesignPattern {
	
	String name;
	int age;
	static int obj_count;
	private static Singleton_DesignPattern m;
	
private Singleton_DesignPattern() {
	obj_count++;
}

public static Singleton_DesignPattern getInstance() {
	if(m==null) {
		m=new Singleton_DesignPattern();
		return m;
	}
	else {
		return m;
	}
	
}
void sleep() {}
void eat() {}
void work() {}
}

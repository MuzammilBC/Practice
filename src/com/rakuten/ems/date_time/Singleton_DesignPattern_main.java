package com.rakuten.ems.date_time;

public class Singleton_DesignPattern_main {

	public static void main(String[] args) {
		Singleton_DesignPattern m=Singleton_DesignPattern.getInstance();
		Singleton_DesignPattern k=Singleton_DesignPattern.getInstance();
		Singleton_DesignPattern.getInstance();
		Singleton_DesignPattern.getInstance();
		System.out.println(m);
		System.out.println(k);
		System.out.println("you have created :"+Singleton_DesignPattern.obj_count+" objects");

	}

}

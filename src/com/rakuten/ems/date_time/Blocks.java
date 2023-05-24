package com.rakuten.ems.date_time;

public class Blocks {
	
	
	{
		System.out.println("hello");
	}
	{
		System.out.println("hi");
	}
	static {
		System.out.println("welcome");
	}
	static {
		System.out.println("bye");
	}
	
	Blocks(){
		System.out.println("Block are called");
	}

	public static void main(String[] args) {
			Blocks b=new Blocks();
			System.out.println("Bye");

	}

}

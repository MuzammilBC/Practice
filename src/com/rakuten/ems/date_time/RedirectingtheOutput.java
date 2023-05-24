package com.rakuten.ems.date_time;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectingtheOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintStream file =new PrintStream("/Users/ts-muzammil.c/Desktop/test_7.txt");
		PrintStream console=System.out;
		
		System.setOut(file);
		System.out.println("welcome to Bangalore");
		
		System.out.println("Muzammil");
		
		System.setOut(console);
		System.out.println("welcome to India");

	}

}

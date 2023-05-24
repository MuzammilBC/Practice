package com.rakuten.ems.date_time;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream f=new FileOutputStream("/Users/ts-muzammil.c/Desktop/test_3.txt");
		String S= "Muzammil is no avable to print the \r\new line im the next line";
		
		int k=7823;
		String j=k+"bh";
		f.write(j.getBytes());
		f.flush();
		f.close();
		System.out.println("success");
		

	}
		catch(FileNotFoundException e) {
			System.out.println("failed due to"+e.getMessage());
		}
			catch(IOException ioe) {
			System.out.println("failed due to"+ioe.getMessage());
		}

}
	}

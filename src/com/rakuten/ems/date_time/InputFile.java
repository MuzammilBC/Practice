package com.rakuten.ems.date_time;

import java.io.FileInputStream;
import java.io.IOException;

public class InputFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream("/Users/ts-muzammil.c/Desktop/test_3.txt");
		int i=0;
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
			
		}
for(int k=0;(k=fi.read())!=-1;k++) {
	System.out.print((char)k);
}
	}

}

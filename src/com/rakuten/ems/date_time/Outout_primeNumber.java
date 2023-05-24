package com.rakuten.ems.date_time;

import java.io.FileOutputStream;
import java.io.IOException;

public class Outout_primeNumber {
	public static void main(String[] args) throws IOException {
		
    	FileOutputStream f=new FileOutputStream("/Users/ts-muzammil.c/Desktop/test_5.txt", true);
	        for(int i = 1; i <= 20;i++ )
	        {
	            if(isPrime(i))
	            {
	        		f.write((i+" ").getBytes());
	            }
	        }    
	    }
	 
	    public static boolean isPrime(int number)
	    {
	    	int count = 0;
	        for(int i = 1; i <= number; i++)
	    {
	        if(number % i == 0)
	            {
	                count++;
	            }
	        }
	        if(count==2)
	 
	        return true;
	        else {
	        	return false;
	    }
	}
}
	



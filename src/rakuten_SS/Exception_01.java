package rakuten_SS;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numarater");
		int a=sc.nextInt();
		System.out.println("Enter the Dinominator");
		int b=sc.nextInt();
try {
	System.out.println(a/b);		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Data clsoed");
		System.out.println("Report Generted");		
		
	}

}


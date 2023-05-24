package com.rakuten.ems.date_time;

public class TestAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=new Alpha();
		System.out.println(a.age);
		Alpha.Beta b=a.new Beta();
		b.Display();
		Alpha.Beta.show();

	}

}

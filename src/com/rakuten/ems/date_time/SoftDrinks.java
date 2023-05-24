package com.rakuten.ems.date_time;

public class SoftDrinks {
	public static void main(String[] args) {
		
		//Anonymous inner class
		Drinkable d= new Drinkable() {
			
			@Override
			public void drinks(String name) {
				System.out.println("Manu Drinks soft Drinks"+name);
				
			}
		};
		d.drinks("bear");
		
		Drinkable d1=(drink)->{
			System.out.println("manu drinks"+drink);
			
			System.out.println("Even though manu drinks"+drink+",he won't vomit");
		
		};
		d1.drinks("wine");
	}

}

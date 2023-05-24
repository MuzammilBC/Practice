package com.rakuten.ems.date_time;

public class Poroduct {

		int Pid;
		String ProdName;
		int qty;
		double price;
		
		
		public void Product(int pid, String prodName, int qty, double price) {
			
			Pid = pid;
			ProdName = prodName;
			this.qty = qty;
			this.price = price;
		}

}

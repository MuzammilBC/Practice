package com.rakuten.ems.date_time;

import java.util.ArrayList;
import java.util.Collections;

//functional type of interface we are using

public class Aryl_product implements Comparable<Aryl_product>{

	String productName;

	public Aryl_product(String productName) {
		this.productName = productName;
	}

	@Override
	public int compareTo(Aryl_product o) {
		return this.productName.compareTo(o.productName);

	}
	@Override
	public String toString() {

		return this.productName;
	}

	public static void main(String[] args) {
		ArrayList<Aryl_product> plist=new ArrayList<Aryl_product>();
		plist.add(new Aryl_product("Mouse"));
		plist.add(new Aryl_product("Keyboard"));
		plist.add(new Aryl_product("projector"));
		plist.add(new Aryl_product("Hardisk"));
		plist.add(new Aryl_product("Screen"));
		System.out.println(plist);
		Collections.sort(plist,Collections.reverseOrder());
		System.out.println(plist);

	}
}

package com.rakuten.ems.date_time;

public class Box {
	int weight=854;
	static int height=45;

	void open() {
		System.out.println(height);
		System.out.println(weight);

		class Test{
			static int age=43;
			String name="welcome";

			void Display() {
				System.out.println(age);
				System.out.println(name);
			}
		}
		Test t=new Test();
		t.Display();
	}
	static void dispaly() {
		System.out.println(height);
		Box b=new Box();
		System.out.println(b.weight);

		class Laptop{
			int price =56432;
			static String make="HP";
			void display() {
				System.out.println(price);
			}
			static void show() {
				Laptop l=new Laptop();
				l.display();
			}
		}
		Laptop.show();
	}
	public static void main(String[]args) {
		Box b=new Box();
		b.open();
	}

}

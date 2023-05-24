package rakuten_SS;
public class Aircraft {

	int no_of_wings;
	String color;
	Propellers p;
	Wheels w;
	Doors d;
	Seats s;
	Engine e;


	void takeoff() {
		System.out.println("The Aircraft is ready to take off");

	}
	void fly() {
		System.out.println("The Aircraft is flying at altitue of 15000 meters");

	}
	void land() {
		System.out.println("The Aircraft is going to land");

	}
}


class Propellers{}
class Wheels{}
class Doors{}
class Seats{}
class Engine{}
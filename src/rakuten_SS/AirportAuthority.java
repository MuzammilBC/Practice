package rakuten_SS;
public class AirportAuthority {
	public static void main(String[] args) {
		//Aircraft a = new Aircraft();
		Airplane aero = new Airplane();
		aero.taxie();
		aero.takeoff();
		aero.fly();
		aero.land();
//		The super class object cannot access sub class specific behaviour		
//		Aircraft a = new Aircraft();
//		a.taxie();
//		a.land();
		
		Helicopter heli = new Helicopter();
		heli.fly();
	}
}

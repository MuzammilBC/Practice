package rakuten_SS;
public class Airplane extends Aircraft{

	void taxie() {
		System.out.println("The Airplane is being takied to the runway");
	}

}

class Helicopter extends Aircraft{
	@Override
	public void fly() {
		System.out.println("Helicopter flies at 10000 meters altitude");
	}
}
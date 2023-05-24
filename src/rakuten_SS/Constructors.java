package rakuten_SS;
public class Constructors {
	int size;
	float avg;
	String name;
	
	Constructors(){
		size = 67;
		avg = 34.56f;
		name = "Superman";
	}
	public static void main(String[] args) {
	Constructors c = new Constructors();
	
	System.out.println(c.size);
	System.out.println(c.avg);
	System.out.println(c.name);
	}
}

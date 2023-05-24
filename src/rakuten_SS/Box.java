package rakuten_SS;
public class Box {
	static final String n = "Welcome";
	Box(){
		this(n);
		int a = 345;
		System.out.println("Created the box using no argument");
	}
	Box(String s){
		this(10);
		System.out.println("Created the box using string argument");
	}
	Box(int a){
		this(45.34);
		System.out.println("Created the box using integer argument");	
	}
	Box(double d){
		
	System.out.println("Created the box using double argument");	
	}

	
	void display() {
		
	}
	void display(String s) {
		display();
	}
	public static void main(String[] args) {
		Box b1 = new Box();
	}
}

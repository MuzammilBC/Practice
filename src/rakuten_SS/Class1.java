package rakuten_SS;
public class Class1 {
	int age = 10;
	static String name = "Muthu";
	
	void display() {
		System.out.println(age);
		System.out.println(name);
	}
	
	static void show() {
		System.out.println(name);
		Class1 obj = new Class1();
		System.out.println(obj.age);
	}
}

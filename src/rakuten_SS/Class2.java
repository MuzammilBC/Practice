package rakuten_SS;
public class Class2 {
	void test() {
		Class1 c = new Class1();
		System.out.println(c.age);
		System.out.println(Class1.name);
	}
	public static void main(String[] args) {
		Class1 cl = new Class1();
		System.out.println(cl.age);
		System.out.println(Class1.name);
		Class2 c3 = new Class2();
		c3.test();
		cl.display();
		Class1.show();
		
		
		
	}
}

package rakuten_SS;
public class Demo {
	static int height = 8848;
	double salary = 56789.78;
 void display() {
	 System.out.println(height);
	 System.out.println(salary);
 }
 static void show() {
	System.out.println(height);
	Demo d = new Demo();
	System.out.println(d.salary);
 }
 public static void main(String[] args) {
	show();
	Demo e = new Demo();
	e.display();
	
}
}

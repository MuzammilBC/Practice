package rakuten_SS;
public class Areas {
	int area(int a) {
		return a*a;
	}
	int area(int l, int b) {
		return l * b;
	}
	double area(double r) {
		return 3.14* r * r;
	}
	long area(int h, long b) {
		return (h * b)/2; 
	}
	
	public static void main(String[] args) {
		Areas a = new Areas();
		long trianglearea = a.area(34,456890098L);
		System.out.println(trianglearea + "cm");
	}
}

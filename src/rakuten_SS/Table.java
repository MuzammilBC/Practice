package rakuten_SS;
import java.util.Scanner;

public class Table {
	String manufacturer;
	double length;
	double width;
	double height;
	String color;
	String material;
	
	Table(String manufacturer){
		this(12.5, 26.3, 7.4);
		this.manufacturer = manufacturer;
	}

	Table(double length, double width, double height) {
		this("Brown","wood");
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Table(String color, String material) {
		this.color = color;
		this.material = material;
	}
	public static void main(String[] args) {
		System.out.println("Enter the manufacturer name: ");
		Scanner scan = new Scanner(System.in);
		String manu = scan.next();
		Table t = new Table(manu);
		System.out.println(t.color);
		System.out.println(t.material);
		System.out.println(t.length);System.out.println(t.width);System.out.println(t.height);
		System.out.println(t.manufacturer);
	}
	
}

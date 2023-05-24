
package rakuten_SS;
import java.util.Scanner;
public class NestedFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a byte value");
		byte b = scan.nextByte();
		System.out.println("Enter a short value");
		short s = scan.nextShort(); 
		System.out.println("Enter an integer value");
		int i = scan.nextInt();
		System.out.println("Enter a Long value");
		long l = scan.nextLong();
		System.out.println("Enter a float value");
		float f = scan.nextFloat();
		System.out.println("Enter a double value");
		double d = scan.nextDouble();
		System.out.println("Enter a Boolean value");
		boolean bool = scan.nextBoolean();
		System.out.println("Enter a single word");
		String s1 = scan.next();
		System.out.println();
		System.out.println("Enter a sentence");
		scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println("Enter a single character");
		char ch = scan.next().charAt(0);
		
	}
}
package rakuten_SS;
import java.util.Scanner;

public class GetInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the names array");
		int count = scan.nextInt();
		String[] names = new String[count];

		System.out.println("Enter the names");
		for(int i=0; i<names.length; i++) {
			System.out.println("Enter the value for index " + i +": ");
			names[i] = scan.next();
		}
		
		System.out.println("Dispalying the elements");
		for(String n:names) {
			System.out.println(n);
		}
	}
}

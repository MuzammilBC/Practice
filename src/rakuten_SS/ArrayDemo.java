package rakuten_SS;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50};
		for(int i = 0; i<=4; i++) {
			System.out.println(numbers[i]);
		}
		Scanner s = new Scanner(System.in);
		char[] c = new char[5];
		for(int j=0; j<=4;j++) {
			c[j] = s.next().charAt(0);
		}
		for(int i = 0; i<=4; i++) {
			System.out.println(c[i]);
		}
		
		
	}
	
}

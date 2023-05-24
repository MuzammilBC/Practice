package rakuten_SS;
import java.util.Scanner;

public class SplitArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the first split array: ");
		int fasize = scan.nextInt();
		int b[] = new int[fasize];
		int c[] = new int[a.length-b.length];
		for(int i=0; i<a.length; i++) {
			if(i<fasize) {
				b[i] = a[i];
			}
			else {
				c[i-b.length] = a[i];
			}
		}
		System.out.println("Printing the First Split Array");
		ArrayUtility.displayArray(b);
		System.out.println();
		System.out.println("Printing the Second Split Array");
		ArrayUtility.displayArray(c);
	}
}

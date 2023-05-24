
package rakuten_SS;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element that you need to find: ");
		int element = scan.nextInt();
		int position = -1;
		int ele = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] == element) {
				ele = a[i];
				position = i+1;
			}
		}
		System.out.println("Element found at postion: " + position);
		System.out.println("Element is: " + ele);
	}
}

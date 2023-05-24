package rakuten_SS;
import java.util.Scanner;

public class ArrayOperations {
public static void main(String[] args) {
	//1. Create two arrays
	//2. Merge those arrays
	//3. Display the merged arrays
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of first Array: ");
	int falength = scan.nextInt();
	int arr1[] = ArrayUtility.createArray(falength);
	System.out.println("Enter the length of second Array: ");
	int salength = scan.nextInt();
	int arr2[] = ArrayUtility.createArray(salength);
	int result[] = ArrayUtility.mergeArrays(arr1, arr2);
	ArrayUtility.displayArray(result);
}
}

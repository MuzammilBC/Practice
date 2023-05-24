package rakuten_SS;
/*
 * Create an array that contains 5 elements of the type integer
 * 101,345,564,864,97
 * 
 * While printing the array, print as follows
 * [101, 345, 564, 864, 97]
 * */
public class DisplayArray {
	public static void main(String[] args) {
		int [] arr = {101,345,564,864,97};
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i==arr.length-1) {
				System.out.print("]");	
			}
			else {
				System.out.print(", ");
			}

		}
	}
}
// explain the logic to merge two different array of same data type
// into a single array
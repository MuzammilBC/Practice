package rakuten_SS;
public class MergeArray {
	public static void main(String[] args) {
		int arr1[] = {3,4,5,6,7,8};
		int arr2[] = {10,15,21,36,49,64,78,97};
		int arr3[] = new int[arr1.length+arr2.length];
		for(int i=0; i<arr3.length; i++) {
			if(i<arr1.length) {
				arr3[i] = arr1[i];
			}
			else {
				arr3[i] = arr2[i-arr1.length];
			}
		}
		
		for(int ele:arr3) {
			System.out.print(ele+" ");
		}
	}
}

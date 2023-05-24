package rakuten_SS;
public class ArraySum {
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}			
		};
		System.out.println("Printing Row Sum");
		for(int i=0; i<array.length; i++) {
			int rsum = 0;
			for(int j=0; j<array[i].length;j++) {
				rsum = rsum + array[i][j];
			}
			System.out.println("Sum of " + (i+1) + " Row: " + rsum);
		}
		System.out.println("Printing Col Sum");
		for(int i=0; i<array.length; i++) {
			int csum = 0;
			for(int j=0; j<array[i].length;j++) {
				csum = csum + array[j][i];
			}
			System.out.println("Sum of " + (i+1) + " Col: " + csum);
		}
	}
}

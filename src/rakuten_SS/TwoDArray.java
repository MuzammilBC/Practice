package rakuten_SS;
public class TwoDArray {
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9}			
		};
		int pdiagsum=0 , sdiagsum =0;

		System.out.println("Printing Primary Diagonal details");
		System.out.print("Primary Diagonal Values: ");
		for(int i=0; i<array.length; i++) {
			pdiagsum = pdiagsum + array[i][i];
			System.out.print(array[i][i]+" ");
		}
		System.out.println("\nPrimary Diagonal Sum:" + pdiagsum);
		System.out.println();
		System.out.println("Printing Secondary Diagonal details");
		System.out.print("Secondary Diagonal Values: ");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i+j == array.length-1) {
					System.out.print(array[i][j]+ " ");
					sdiagsum = sdiagsum + array[i][j];
				}
			}
		}
		System.out.println("\nSecondary Diagonal Sum:" + sdiagsum);
	}
}
//Primary Diagonal: 1 5 9
//Primary Diagonal Sum: 15
//
//Secondary Diagonal: 7 5 3
//Secondary Diagonal Sum: 15
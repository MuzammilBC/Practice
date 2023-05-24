
package rakuten_SS;
public class OneDArray {
public static void main(String[] args) {
	int[] empno = new int[5];
	empno[0] = 4532;
	empno[1] = 4533;
	empno[2] = 452;
	empno[3] = 455;
	empno[4] = 4562;
	
	for(int i=0; i<=empno.length-1; i++) {
		System.out.print(empno[i]+" ");
	}
	System.out.println();
	int n =0;
	while(n<=4) {
		System.out.print(empno[n]+" ");
		n++;
	}
	System.out.println();
	for(int element:empno) {
		
		System.out.print(element+" ");
		
		
	}
}
}

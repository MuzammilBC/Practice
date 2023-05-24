package rakuten_SS;
import java.util.Scanner;

public class WordReplace {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a string");
	String st = s.next();
	String ss ="";
	for(int i=st.length()-1; i>=0; i--) {
		ss += st.charAt(i);
	}
	System.out.println(ss);
}
}
// GOD CREATED HUMANS

// HUMANS CREATED GO
package rakuten_SS;
public class ReverseWords {
public static void main(String[] args) {
	String s = "GOD CREATED HUMANS";
	String[] words = s.split("\\s");
	for(int i=words.length-1; i>=0; i--) {
		System.out.print(words[i]+" ");
	}
}
}

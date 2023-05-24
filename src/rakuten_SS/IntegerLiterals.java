package rakuten_SS;
public class IntegerLiterals {
	public static void main(String[] args) {
		String c = "asdasd \u7849";
		String g = "Nehru's B'day is called as \"Children's Day\"";
		String sentence = "Video provides a powerful way to help you "
				+ "\nprove your point. When you click Online Video, you can "
				+ "\npaste in the embed code for the video you want to add. "
				+ "\nYou can also type a keyword to search online for the "
				+ "\nvideo that best fits your document.";
		System.out.println(sentence);
		System.out.println("Hello"+(20+30));
		System.out.println(20+30+"Hello");
		
		System.out.println(23/12);
		System.out.println(23/12.0);
		System.out.println(23.0/12);
		System.out.println(23.0/12.0);
		
//		System.out.println(2%0);
		System.out.println(2.0%0);
		System.out.println(2%0.0);
		System.out.println(2.0%0.0);
		int h = 10;
		System.out.println(++h);
		System.out.println(h);
		
		System.out.println(~9);
		System.out.println(~-9);
		
		System.out.println(10>>2);
		
		int ma = 10;
		int mb = 20;
		System.out.println(ma>mb?"ma is big":"mb is big");
	}
}
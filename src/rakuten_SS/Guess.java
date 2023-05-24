package rakuten_SS;
public class Guess {
	void test(int a) {
		
	}
}

class GuessedWrong extends Guess{
	@Override
	void test(int a){
		System.out.println("Hi");
	}
	
	void test(){
		System.out.println("Hi");
	}
	
}

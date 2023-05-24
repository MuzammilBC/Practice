package rakuten_SS;
public class Cow {
	Milks gives() {
		return new Milks();
	}
	public static void main(String[] args) {
		Cow c = new Cow();
		Milks m = c.gives();
		System.out.println(m);
		c = null;
		m = c.gives();
		System.out.println(m);
	}
}

class Milks{}
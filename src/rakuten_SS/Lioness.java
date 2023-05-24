package rakuten_SS;
public class Lioness {
	Milk gives(Meat m, Water w) {
		return new Milk();
	}
	public static void main(String[] args) {
		Lioness l = new Lioness();
		Meat m = new Meat();
		Water w = new Water();
		Milk mlk = l.gives(m,w);
		System.out.println(mlk);
	}
}
class Water{}
class Meat{}
class Milk{}

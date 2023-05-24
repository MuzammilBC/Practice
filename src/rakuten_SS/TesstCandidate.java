package rakuten_SS;
public class TesstCandidate {
	public static void main(String[] args) {
		Address a = new Address("Ahemadabad", "Gujrat", "India");
		Candidates c = new Candidates("Modi", 73, a);
		c.display();
		c = null;
		System.out.println(a.city);
		System.out.println(a.state);
		System.out.println(a.country);		
	}

}

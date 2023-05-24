package rakuten_SS;
public class Candidates {
	String name;
	int age;
	Address add;
	public Candidates(String name, int age, Address add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(add.city);
		System.out.println(add.state);
		System.out.println(add.country);
	}
}

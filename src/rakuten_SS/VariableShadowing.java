package rakuten_SS;
public class VariableShadowing {
	String name;
	String desig;
	VariableShadowing(String name, String desig) {
		this.name = name;
		this.desig = desig;
	}
	public static void main(String[] args) {
		VariableShadowing vs = new VariableShadowing("Rahul", "Prisoner");
		System.out.println(vs.name);
		System.out.println(vs.desig);
	}
}

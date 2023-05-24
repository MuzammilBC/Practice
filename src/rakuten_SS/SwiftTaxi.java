package rakuten_SS;
public class SwiftTaxi implements BhuvanMap, GMap, ManuMap{//change 1

	public static void main(String[] args) {
		SwiftTaxi st = new SwiftTaxi();
		st.findLocation("Bangalore");
		st.findRoute("Bangalore", "Ladakh");
	}

	@Override
	public void findLocation(String location) {
		System.out.println("Location found @ 12.9716° N, 77.5946° E");	
	}

	@Override
	public void findRoute(String src, String destn) {
		System.out.println(src + "- Goa - Gujarath - MadhyaPradesh - UttarPradesh - Delhi - Himachal Pradesh Manali - Leh " + destn);
	}
}

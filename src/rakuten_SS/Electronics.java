package rakuten_SS;
public class Electronics {
	String name;
	String model;
	static int available_quantity;
	static double price;
	static void DisplayProducts() {
		Electronics e = new Electronics();
		System.out.println("-------------------------");
		System.out.println("Product Details");
		System.out.println("-------------------------");
		System.out.println("Product Name: " + e.name);
		System.out.println("Model: " + e.model);
		System.out.println("-------------------------");
		
	}
	
	void displayPriceDetails() {
		System.out.println("-------------------------");
		System.out.println("Price Details");
		System.out.println("-------------------------");
		System.out.println("Quantity: " + available_quantity);
		System.out.println("Price: " + price);
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		Electronics iphone = new Electronics();
		iphone.name = "Iphone";
		iphone.model = "14 Pro";
		DisplayProducts();
		iphone.displayPriceDetails();
	}
}

package rakuten_SS;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class ShoppingCart {
	    private Map<String, Integer> cart;
	    private Scanner scanner;

	    public ShoppingCart() {
	        cart = new HashMap<>();
	        scanner = new Scanner(System.in);
	    }

	    public void addItem() {
	        System.out.print("Enter item name: ");
	        String itemName = scanner.nextLine();
	        System.out.print("Enter item quantity: ");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); // Consume newline left-over from nextInt()

	        if (cart.containsKey(itemName)) {
	            int currentQuantity = cart.get(itemName);
	            cart.put(itemName, currentQuantity + quantity);
	        } else {
	            cart.put(itemName, quantity);
	        }
	        System.out.println(itemName + " added to cart. Total items in cart: " + getTotalQuantity());
	    }

	    public void removeItem() {
	        System.out.print("Enter item name: ");
	        String itemName = scanner.nextLine();
	        System.out.print("Enter item quantity: ");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); // Consume newline left-over from nextInt()

	        if (cart.containsKey(itemName)) {
	            int currentQuantity = cart.get(itemName);
	            if (currentQuantity == quantity) {
	                cart.remove(itemName);
	            } else if (currentQuantity > quantity) {
	                cart.put(itemName, currentQuantity - quantity);
	            }
	            System.out.println(itemName + " removed from cart. Total items in cart: " + getTotalQuantity());
	        } else {
	            System.out.println(itemName + " not found in cart.");
	        }
	    }

	    public void searchForItem() {
	        System.out.print("Enter item name: ");
	        String itemName = scanner.nextLine();

	        if (cart.containsKey(itemName)) {
	            int currentQuantity = cart.get(itemName);
	            System.out.println(itemName + " found in cart with quantity " + currentQuantity + ".");
	        } else {
	            System.out.println(itemName + " not found in cart.");
	        }
	    }

	    public int getTotalQuantity() {
	        int totalQuantity = 0;
	        for (int quantity : cart.values()) {
	            totalQuantity += quantity;
	        }
	        return totalQuantity;
	    }

	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();

	        while (true) {
	            System.out.println("Please select an option:");
	            System.out.println("1. Add item");
	            System.out.println("2. Remove item");
	            System.out.println("3. Search for item");
	            System.out.println("4. Exit");

	            int choice = cart.scanner.nextInt();
	            cart.scanner.nextLine(); // Consume newline left-over from nextInt()

	            switch (choice) {
	                case 1:
	                    cart.addItem();
	                    break;
	                case 2:
	                    cart.removeItem();
	                    break;
	                case 3:
	                    cart.searchForItem();
	                    break;
	                case 4:
	                    System.out.println("Exiting shopping cart.");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            System.out.println();
	        }
	    }
	}




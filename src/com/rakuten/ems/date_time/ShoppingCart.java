package com.rakuten.ems.date_time;

	import java.util.HashMap;
	import java.util.Map;

	public class ShoppingCart {
	    private Map<String, Integer> cart;

	    public ShoppingCart() {
	        cart = new HashMap<>();
	    }

	    public void addItem(String itemName, int quantity) {
	        if (cart.containsKey(itemName)) {
	            int currentQuantity = cart.get(itemName);
	            cart.put(itemName, currentQuantity + quantity);
	        } else {
	            cart.put(itemName, quantity);
	        }
	        System.out.println(itemName + " added to cart. Total items in cart: " + getTotalQuantity());
	    }

	    public void removeItem(String itemName, int quantity) {
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

	    public void searchForItem(String itemName) {
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
	        cart.addItem("Apple", 2);
	        cart.addItem("Orange", 1);
	        cart.addItem("Banana", 3);
	        cart.addItem("Apple", 1); // Add another apple
	        cart.removeItem("Orange", 1);
	        cart.searchForItem("Banana");
	        cart.searchForItem("Watermelon"); // Not in cart
	    }
	}




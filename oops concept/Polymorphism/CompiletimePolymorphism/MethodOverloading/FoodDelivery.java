package Polymorphism.CompiletimePolymorphism.MethodOverloading;

public class FoodDelivery {
	 // 1. Place order using just item name
    public void placeOrder(String itemName) {
        System.out.println("Order placed for: " + itemName);
    }

    // 2. Place order with item and quantity
    public void placeOrder(String itemName, int quantity) {
        System.out.println("Order placed for: " + quantity + " x " + itemName);
    }

    // 3. Place order with item, quantity, and special instruction
    public void placeOrder(String itemName, int quantity, String instruction) {
        System.out.println("Order placed: " + quantity + " x " + itemName + ". Note: " + instruction);
    }

    // 4. Place order with item and delivery location
    public void placeOrder(String itemName, String deliveryLocation) {
        System.out.println("Order placed for " + itemName + " to be delivered at: " + deliveryLocation);
    }
}

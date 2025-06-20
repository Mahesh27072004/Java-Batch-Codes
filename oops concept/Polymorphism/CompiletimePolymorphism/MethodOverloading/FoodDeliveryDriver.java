package Polymorphism.CompiletimePolymorphism.MethodOverloading;

public class FoodDeliveryDriver {

	public static void main(String[] args) {
		FoodDelivery f = new FoodDelivery();
		
		f.placeOrder("Burger");
		f.placeOrder("Pizza", 2);
	    f.placeOrder("Pasta", 1, "Less spicy");	
	    f.placeOrder("Sushi", "Office, 3rd Floor");
	}

}

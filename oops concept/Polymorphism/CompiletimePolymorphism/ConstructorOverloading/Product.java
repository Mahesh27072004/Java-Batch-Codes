package Polymorphism.CompiletimePolymorphism.ConstructorOverloading;

public class Product {
	
	  	String name;
	    double price;
	    String description;
	    double rating;

	    // Constructor 1 – Minimal info (name only)
	    public Product(String name) {
	        this.name = name;
	    }

	    // Constructor 2 – Name and price
	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    // Constructor 3 – Name, price, and description
	    public Product(String name, double price, String description) {
	        this.name = name;
	        this.price = price;
	        this.description = description;
	    }

	    // Constructor 4 – All fields
	    public Product(String name, double price, String description, double rating) {
	        this.name = name;
	        this.price = price;
	        this.description = description;
	        this.rating = rating;
	    }

	    public void displayProduct() {
	        System.out.println("Product: " + name + ", ₹" + price + ", " + description + ", Rating: " + rating);
	    }

}

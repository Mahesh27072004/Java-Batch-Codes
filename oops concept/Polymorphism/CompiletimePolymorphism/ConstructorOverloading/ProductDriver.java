package Polymorphism.CompiletimePolymorphism.ConstructorOverloading;

public class ProductDriver {
	 public static void main(String[] args) {
	        Product p1 = new Product("Laptop");
	        Product p2 = new Product("Smartphone", 14999);
	        Product p3 = new Product("T-shirt", 599, "Cotton, size M");
	        Product p4 = new Product("Headphones", 1999, "Wireless, Noise Cancelling", 4.5);

	        p1.displayProduct();
	        p2.displayProduct();
	        p3.displayProduct();
	        p4.displayProduct();
	      
	 }
}

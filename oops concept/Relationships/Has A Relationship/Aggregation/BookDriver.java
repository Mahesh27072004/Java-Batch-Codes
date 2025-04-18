package HasARealtionShip.Aggregation;

public class BookDriver {
	public static void main(String[] args) {
		Bag bag = new Bag( "Skybag",  "adventure",  "polythin",  2000,  18,  "violet");
		bag.addBook("FullScape","Classmate","A4",200,60);
		bag.addBook("short", "krishna", "A1", 100, 25);
		bag.addPen("Gell","TriMax","blue",45);
		bag.addPen("Gell", "Montex", "blue", 10);
		bag.addPen(null, null, null, 0);
		bag.addWaterBottle("metal","nanobot","1L",250);
	}
}

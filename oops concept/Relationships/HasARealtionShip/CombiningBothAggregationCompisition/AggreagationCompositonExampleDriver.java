package HasARealtionShip.CombiningBothAggregationCompisition;
import HasARealtionShip.*;
public class AggreagationCompositonExampleDriver {

	public static void main(String[] args) {
		
		Processor processor = new Processor("Dual core","6g",2.5, 12, 512);
		Mobile mobile= new Mobile("Redmi",  "Note 13 pro",  "purple-blue",  34000, 200, processor);
	
		mobile.addHeadPhone("boat","buds","15.1.1",300);
		
		mobile.getHeadphone().displayHeadPhone();
		mobile.addCharger("portronics", 67, "type-c");
		mobile.getCharger().displayCharger();
		
		SimCard[] arr = mobile.getSimcards();
		mobile.addSimcard("Jio", "5G", "prepaid", 9876543210l);
		
		for(SimCard ele: arr) {
			try {
				ele.displaySim();
			}catch(Exception e) {
				System.out.println("One Sim space is empty");
			}
			
		}
		mobile.addSimcard("Airtel", "5G", "prepaid", 1234568790l);
		mobile.addSimcard("bsnl", "5G", "prepaid", 1234568790l);
	}

}

package HasARealtionShip;


public class MobileDriver {
	public static void main(String[] args)
	{
		OperatingSystem os = new OperatingSystem("Android 13","Xiaomi HyperOS",128,"26/10/2023");
		Mobile obj = new Mobile( "Redmi",  "Note 13 pro",  "purple-blue",  34000, 200, os);
		obj.displayMobile();
		obj.getOS().displayOS()	;
		obj.getBattery().displayBattery();
		
	}
}

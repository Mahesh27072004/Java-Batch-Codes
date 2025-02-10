import java.util.Scanner;
class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while(true)
		{
        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");
        int choice = sc.nextInt();

        double temperature, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("\nEnter temperature in Celsius: ");
                temperature = sc.nextDouble();
                convertedTemp = (temperature * 9.0 / 5.0) + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
				System.out.println();
                break;

            case 2:
                System.out.print("\nEnter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                convertedTemp = (temperature - 32) * 5.0/ 9.0;
                System.out.println("Temperature in Celsius: " + convertedTemp);
				System.out.println();
                break;

            case 3:
                System.out.print("\nEnter temperature in Celsius: ");
                temperature = sc.nextDouble();
                convertedTemp = temperature + 273.15;
                System.out.println("Temperature in Kelvin: " + convertedTemp);
				System.out.println();
                break;

            case 4:
                System.out.print("\nEnter temperature in Kelvin: ");
                temperature = sc.nextDouble();
                convertedTemp = temperature - 273.15;
                System.out.println("Temperature in Celsius: " + convertedTemp);
				System.out.println();
                break;

            case 5:
                System.out.print("\nEnter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                convertedTemp = (temperature - 32) * 5.0 / 9.0 + 273.15;
                System.out.println("Temperature in Kelvin: " + convertedTemp);
				System.out.println();
                break;

            case 6:
                System.out.print("\nEnter temperature in Kelvin: ");
                temperature = sc.nextDouble();
                convertedTemp = (temperature - 273.15) * 9.0 / 5.0 + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
				System.out.println();
                break;

            default:
                System.out.println("Invalid choice! Please choose a number between 1 and 6.");
				
			System.out.println();	
        }
		}
    }
}

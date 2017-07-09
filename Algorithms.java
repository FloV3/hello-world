import java.util.Scanner;

public class Algorithms {

	//1.60934
	
	public static void main(String args[]) {
		
		String unitString, kmString = "km", milesString = "miles";
		double km, miles;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the miles/kilometers conversion program!");
		
		do {
			System.out.print("Enter the unit you want to convert from (km or miles): ");
			unitString = input.next();
		}while(unitString.equalsIgnoreCase(kmString) == false && unitString.equalsIgnoreCase(milesString) == false);
		
		if(unitString.equalsIgnoreCase(kmString)) {
			
			System.out.print("Enter an amount in kilometers: ");
			km = input.nextDouble();
			miles = convertKmToMiles(km);
			
			System.out.println(km + " kilometers is equal to " + miles + " miles.");
			
		}else if(unitString.equalsIgnoreCase(milesString)) {
			
			System.out.print("Enter an amount in miles: ");
			miles = input.nextDouble();
			km = convertMilesToKm(miles);
			
			System.out.println(miles + " miles is equal to " + km + " kilometers.");
			
		}
		

//		System.out.print("Enter an amount in miles: ");
//		miles = input.nextDouble();
//		km = convertMilesToKm(miles);
//		
//		System.out.println(miles + " miles is equal to " + km + " kilometers.");
//		
//		System.out.print("Enter an amount in kilometers: ");
//		km = input.nextDouble();
//		miles = km * 0.621371;
//		
//		System.out.println(km + " kilometers is equal to " + miles + " miles.");
		
		
		
		input.close();
	}
	
	// @TODO implement this function
	public static double convertDistance(double distance) {
		
		
		return 0;
	}
	
	/**
	 * this converts miles to km and returns the result
	 * @param miles 0
	 * @return the conversion result
	 */
	public static double convertMilesToKm(double miles) {
		
		double conversionFactor = 1.60934;
		return miles * conversionFactor;
	}
	
	public static double convertKmToMiles(double km) {
		
		double conversionFactor = 0.621371;
		return km * conversionFactor;
	}
}

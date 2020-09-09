/*
 *  A Java implementation of the program Miles Per Gallon.
 */
public class MilesPerGallon {

	static final int GALLONS = 12;
	static final int MILES = 350;
	
	public static void main(String[] args) {
		
		System.out.println("A car that holds " + GALLONS
			+ " gallons of gas and drives " + MILES + " miles gets\n"
			+ ((double) MILES / GALLONS) + " miles per gallon of gas.");
		
	}
	
}

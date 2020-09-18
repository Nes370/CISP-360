import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		boolean quit, repeat;
		char c;
		double lowestGallon = 0, highestGallon = 0;
		int incrementRate;
		
		System.out.println("This program creates a gallons to liters conversion table.");
		
		Scanner s = new Scanner(System.in);
		do {
			
			quit = false;
			do {
				repeat = false;
				System.out.print("\nEnter the lowest gallon value to display (q to quit): ");
				
				String input = s.next();
				try {
					lowestGallon = Double.parseDouble(input);
				} catch(NumberFormatException nfe) {
					c = input.charAt(0);
					if(c == 'q') {
						quit = true;
						System.out.println("\n\nAborting; no conversion performed.");
					} else {
						repeat = true;
						System.out.println("\nYou entered an illegal character: (" + c + ')');
					}
				}
				
			} while(!quit && repeat);
			
			if(!quit) do {
				repeat = false;
				System.out.print("\nEnter the highest gallon value to display (q to quit): ");
				
				String input = s.next();
				try {
					highestGallon = Double.parseDouble(input);
				} catch(NumberFormatException nfe) {
					c = input.charAt(0);
					if(c == 'q') {
						quit = true;
						System.out.println("\n\nAborting; no conversion performed.");
					} else {
						repeat = true;
						System.out.println("\nYou entered an illegal character: (" + c + ')');
					}
				}
				
			} while(!quit && repeat);
			
			if(!quit) {
	            System.out.println('\n');
	            if(lowestGallon < 0) {
	                repeat = true;
	                System.out.println("Error: low gallon value must not be negative.");
	            }
	            if(highestGallon < 0) {
	                repeat = true;
	                System.out.println("Error: high gallon value must not be negative.");
	            }
	            if(highestGallon - Math.floor(lowestGallon) > 1000) { // see 0.9 and 1000.1
	                repeat = true;
	                System.out.println("Error: total gallon range must be less than or equal to 1000.");
	            }
	            if(lowestGallon > highestGallon) {
	                repeat = true;
	                System.out.println("Error: high gallon value must be larger than or equal to the low gallon value.");
	            }
	            if(repeat)
	            	System.out.println("Please re-enter low and high gallon values correctly.\n");
	        }
			
		} while(!quit && repeat);
		
		s.close();
		
		if(!quit) {

	        double range = highestGallon - Math.floor(lowestGallon); // see 1000.2 and 1010.1 behavior

	        // calculate increment rate
	        if(range > 100)
	            incrementRate = 20;
	        else if(range > 50)
	            incrementRate = 10;
	        else if(range > 10)
	            incrementRate = 5;
	        else incrementRate = 1;

	        // Round values according to increment rate
	        if(incrementRate == 1) {
	            lowestGallon = Math.floor(lowestGallon);
	            highestGallon = Math.ceil(highestGallon);
	        } else {
	            if(((int) lowestGallon) % incrementRate < 1)
	                lowestGallon = Math.floor(lowestGallon);
	            else lowestGallon = Math.ceil(lowestGallon / incrementRate) * incrementRate;

	            // see 0 and 39.0 behavior vs. 0 and 39.1
	            // determines if value is within 1 of the next increment
	            if(((int) highestGallon) % incrementRate >= incrementRate - 1
	                    // only numbers with non-zero fractional digits will be rounded, e.g. 39.0 -> 35.0, 39.1 -> 40
	                    && highestGallon - ((int) highestGallon) % incrementRate * incrementRate > 0)
	                highestGallon = Math.ceil(highestGallon);
	            else highestGallon = Math.floor(highestGallon / incrementRate) * incrementRate;
	        }

	        System.out.printf("The conversion table will be created for the gallon range\n"
	        		+ "of %.1f to %.1f in increments of %.1f%n%n", lowestGallon, highestGallon, (double) incrementRate);
	        
	        System.out.printf("%20s%n%20s%n%20s%n%20s%n", "GALLONS TO LITERS", "CONVERSION TABLE ", "Gallons    Liters", "=======   =======");

	        int i = 0;
	        double iterativeValue;
	        do {
	            iterativeValue = lowestGallon + incrementRate * i;
	            System.out.printf("%9.1f%11.3f%n", iterativeValue, iterativeValue * 3.785);
	            i++;
	        } while(iterativeValue < highestGallon);

	    }
		
	}

}

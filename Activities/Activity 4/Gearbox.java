import java.util.InputMismatchException;
import java.util.Scanner;

public class Gearbox {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double minimumSpeed = 0, maximumSpeed = 0;
		{
			boolean valid;
			do {
				try {
					System.out.print("Enter a minimum and maximum speed (in revolutions per minute): ");
					minimumSpeed = s.nextDouble();
					maximumSpeed = s.nextDouble();
					
					if(minimumSpeed <= 0 || maximumSpeed <= 0) {
						System.out.println("You must enter two positive number values. Please try again.");
						valid = false;
					}
					else valid = true;
				} catch(InputMismatchException ime) {
					System.out.println("Your input was invalid. Please try again.");
					s.nextLine();
					valid = false;
				}
			} while(!valid);
		}
		s.close();

	    if(maximumSpeed < minimumSpeed) {
	        double temp = maximumSpeed;
	        maximumSpeed = minimumSpeed;
	        minimumSpeed = temp;
	    }

	    double speedRatio = Math.pow(maximumSpeed / minimumSpeed, 0.2);
	    System.out.println("The ratio between successive speeds of a six-speed gearbox"
	        + "\nwith a minimum speed of " + minimumSpeed
	        + " rpm and a maximum speed of " + maximumSpeed
	        + " rpm is " + speedRatio);

	    for(int i = 0; i < 6; i++)
	        System.out.println("Speed " + (i + 1) + " is " + minimumSpeed * Math.pow(speedRatio, i) + " rpm");

	}
	
}

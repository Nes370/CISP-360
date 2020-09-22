import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		 double slope, yIntercept, x_1, y_1, ySolution, delta;

		    // Prompt for slope, m
		    System.out.print("This program verifies that a selected point is on a given line.\n"
		         + "All input values may be integer or floating-point.\n"
		         + "Enter slope: ");
		    slope = s.nextDouble();

		    // Prompt for y-axis intercept, B
		    System.out.print("\nEnter y-intercept: ");
		    yIntercept = s.nextDouble();

		    // Prompt for X and Y coordinates
		    System.out.print("\nEnter coordinates of the point: x y ");
		    x_1 = s.nextDouble();
		    y_1 = s.nextDouble();
		    
		    s.close();

		    // Calculate Y = mX + B
		    ySolution = slope * x_1 + yIntercept;

		    // Calculate delta
		    delta = 0.02 * Math.abs(ySolution);

		    int status = 0;

		    if(Math.abs(ySolution - y_1) <= delta) {
		      status = 1;
		      System.out.println("\nThe point is on the line.");
		    } else  {
		      System.out.println("\nThe point is NOT on the line.");
		    }

		    // Return result
		    System.exit(status);
		
	}

}

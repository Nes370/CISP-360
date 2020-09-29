import java.util.Scanner;

public class Activity10 {

	final static int MAX_WIDTH = 40,
					 MAX_HEIGHT = MAX_WIDTH / 2;
	
	public static void main(String[] args) {
		
		int width = getWidth();
		checkerboard(width);
		
	}
	
	public static int getWidth() {
		
		Scanner s = new Scanner(System.in);
		int width = 0;
		boolean valid;
		 do {
		        valid = true;

		        System.out.print("Enter an integer in the range of 1 to " + MAX_WIDTH + ": ");
		        try {
		        	width = s.nextInt();
		        	if(valid && (width < 1 || width > MAX_WIDTH)) {
			        	valid = false;
			        	System.out.println("Error: You must enter an integer in the range of 1 to " + MAX_WIDTH + '.');
			        }
		        } catch(NumberFormatException nfe) {
		        	valid = false;
		        	System.out.println("Error: You must enter a valid integer value.");
		        }
		    } while(!valid);
		 
		 s.close();
		 return width;
		 
	}
	
	public static void checkerboard(int width) {
		
		 for(int i = 0; i < MAX_HEIGHT; i++) {
		        int a = i / width % 2;
		        for(int j = 0; j < MAX_WIDTH; j++) {
		            if(a != j / width % 2)
		                System.out.print('*');
		            else System.out.print('.');

		        }
		        System.out.println();
		 }
		 
	}

}
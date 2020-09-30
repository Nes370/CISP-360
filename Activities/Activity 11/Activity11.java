import java.util.InputMismatchException;
import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		
		int[] lottery = new int[5];
		for(int i = 0; i < lottery.length; i++)
			lottery[i] = (int) (Math.random() * 10);
		
		Scanner s = new Scanner(System.in);
		
		int[] user = new int[5];
		int index = 0;
		do {
			System.out.print("Choose a number between 0 and 9: ");
			try {
				user[index] = s.nextInt();
				
				if(user[index] < 0 || user[index] > 9) {
					index--;
					System.out.println("Error: please enter an integer between 0 and 9.");
				}
			} catch(InputMismatchException ime) {
				index--;
				System.out.println("Error: please enter a valid integer.");
			} finally {
				index++;
			}
		} while(index < 5);
		
		s.close();
		
		int matches = 0;
		for(int i = 0; i < 5; i++)
	        if(lottery[i] == user[i])
	            matches++;

		System.out.println("The winning numbers are: ");
	    for(int i = 0; i < 5; i++)
	    	System.out.print(lottery[i] + " ");
	    System.out.println("\nYour numbers are: ");
	    for(int i = 0; i < 5; i++)
	    	System.out.print(user[i] + " ");
	    System.out.println("\n" + matches + " of your numbers are a match.");
	    if(matches == 5)
	    	System.out.println("You are a GRAND PRIZE WINNER!");
		
	}

}

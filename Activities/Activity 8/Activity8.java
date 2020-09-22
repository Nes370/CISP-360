import java.util.Scanner;

public class Activity8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean quit;
		do {
			
			int number1 = (int) Math.random() * 12 + 1,
				number2 = (int) Math.random() * 12 + 1,
				operation = (int) Math.random() * 4,
				input, answer;

			switch(operation) {
				case 0: answer = number1 + number2; break;
				case 1: answer = number1 - number2; break;
				case 2: answer = number1 * number2; break;
				case 3: answer = number1 / number2; break;
			}

			answer = number1 * number2;

			do {

				switch(operation) {
					case 0: System.out.println("How much is " + number1 + " plus " + number2 + "?\n"); break;
					case 1: System.out.println("How much is " + number1 + " minus " + number2 + "?\n"); break;
					case 2: System.out.println("How much is " + number1 + " times " + number2 + "?\n"); break;
					case 3: System.out.println("How much is " + number1 + " divided by " + number2 + "?\n"); break;
				}

				input = s.nextInt();
				quit = input == -1;

				if(!quit) {
					if(input != answer)
						System.out.println("No. Please try again.");
					else System.out.println("Very good!");
				}

			} while(!quit && input != answer);
			
		} while(!quit);
		
		s.close();
		
	}
	
}
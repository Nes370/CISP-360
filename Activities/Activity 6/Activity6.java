import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		
		int number = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter integer to test: ");
		String input = s.next();
		s.close();
		
		try {
			number = Integer.parseInt(input);
		} catch(Exception e) {
			System.out.println("Oops you entered: " + input);
			System.exit(1);
		}
		
		switch(number) {
			case 1:
				System.out.println("good");
				break;
			case 2:
				System.out.println("better");
				break;
			case 3:
				System.out.println("best");
				break;
			default:
				System.out.println("value out of range");
				break;
		}
		
	}
	
}
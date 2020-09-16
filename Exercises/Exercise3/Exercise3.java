import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		boolean first;
		int second;
		long third;
		float fourth;
		float fifth;
		double sixth;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter boolean, int, long, float, float, and double values: ");
		
		{
			String firstInput = s.next();
			try {
				first = Integer.parseInt(firstInput) == 1;
			} catch(NumberFormatException nfe) {
				first = Boolean.parseBoolean(firstInput);
			}
		}
		second = s.nextInt();
		third = s.nextLong();
		fourth = s.nextFloat();
		fifth = s.nextFloat();
		sixth = s.nextDouble();
		
		s.close();

		System.out.println(((first) ? 1 : 0) + " " + first);
		System.out.println(second + " 0x" + Integer.toHexString(second) + " 0" + Integer.toOctalString(second));
		System.out.printf("%16d%n", third);
		System.out.printf(((fourth < 0) ? '-' : '+') + "%12.0f.%n", Math.abs(fourth));
		System.out.printf("%15.4e%n", fourth);
		System.out.printf("%.7e%n", fifth);
		System.out.printf("%17.3f%n", fifth);
		System.out.println(third);
		System.out.printf("%16.2f%n", fourth);
		System.out.printf("%13.0f%n", sixth);
		System.out.printf("%14.8f%n", fourth);
		{
			int i = 0;
			while(Math.pow(10, i) * Math.abs(sixth) < 100_000) i++;
			System.out.printf("%16." + i + "f%n", sixth);
		}
		
	}

}

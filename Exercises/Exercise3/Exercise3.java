package cisp360;

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
				first = Integer.parseInt(firstInput) != 0;
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
		if(integralDigits(fourth) > 4)
			System.out.printf(((fourth < 0) ? '-' : '+') + "%12.3e%n", Math.abs(fourth));
		else {
			int fourthPrecision = findPrecision(fourth, 4);
			System.out.printf(((fourth < 0) ? '-' : '+') + ((fourthPrecision == 0) ? "%11." + fourthPrecision + "f." : "%12." + fourthPrecision + "f") + "%n", Math.abs(fourth));
		}
		System.out.printf("%15.4e%n", fourth);
		System.out.printf("%.7e%n", fifth);
		System.out.printf("%17.3f%n", fifth);
		System.out.println(third);
		System.out.printf("%16.2f%n", fourth);
		System.out.printf("%13.0f%n", sixth);
		System.out.printf("%14.8f%n", fourth);
		System.out.printf("%16." + findPrecision(sixth, 6) + "f%n", sixth);
		
		
	}
	/**
	 * Determines the number of integral digits in the given value.
	 * @param value
	 * @return integerDigits
	 */
	public static int integralDigits(double value) {
		if(value == 0)
			return 1;
		int integralDigits = 0;
		for(int integerValue = (int) value; integerValue != 0; integralDigits++)
			integerValue /= 10;
		return integralDigits;
	}
	
	/**
	 * Determines the number of fractional digits needed to represent the given value according to the number of significant digits.
	 * @param value
	 * @param significantFigures
	 * @return fractional digit precision
	 */
	public static int findPrecision(double value, int significantFigures) {
		
		int integerDigits = integralDigits(value);
		
		if(significantFigures > integerDigits)
			return significantFigures - integerDigits;
		else return 0;
		
	}

}

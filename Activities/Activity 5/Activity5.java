import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		
		double monthlyRate, loanAmount, monthlyPayment, totalAmountPaid;
		int numberOfMonths;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter an annual interest rate: ");
		monthlyRate = s.nextDouble() / 1200;
		System.out.print("Enter the loan amount: ");
		loanAmount = s.nextDouble();
		System.out.print("Over how many months will you pay this loan? ");
		numberOfMonths = s.nextInt();
		
		s.close();
		
		monthlyPayment = (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) 
				/ (Math.pow(1 + monthlyRate, numberOfMonths) - 1) * loanAmount;
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		
		totalAmountPaid = monthlyPayment * numberOfMonths;
		
		System.out.printf("%24s  $ %8.2f%n", "Loan Amount:", loanAmount);
		System.out.printf("%24s    %8.2f%n", "Monthly Interest Rate:", monthlyRate * 100);
		System.out.printf("%24s    %5d%n", "Number of Payments:", numberOfMonths);
		System.out.printf("%24s  $ %8.2f%n", "Monthly Payment:", monthlyPayment);
		System.out.printf("%24s  $ %8.2f%n", "Amount Paid Back:", totalAmountPaid);
		System.out.printf("%24s  $ %8.2f%n", "Interest Paid:", totalAmountPaid - loanAmount);
		
	}
	
}

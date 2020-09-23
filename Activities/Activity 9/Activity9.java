import java.io.File;
import java.util.Scanner;

public class Activity9 {

	static File INPUT_FILE = new File("data.txt");
	
	public static void main(String[] args) {
		
		double sum = 0.0, first, second;
		Scanner fin;
		try {
			fin = new Scanner(INPUT_FILE);	
			while(fin.hasNext())
			{
				first = fin.nextDouble();
				second = fin.nextDouble();
				sum += first + second;
				System.out.println("sum is " + sum);
			}
			fin.close();
		} catch(Exception e) {
			System.exit(1);
		}
		
	}
	
}

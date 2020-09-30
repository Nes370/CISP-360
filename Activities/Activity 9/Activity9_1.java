import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Activity9_1 {

	public static void main(String[] args) {

		try {
			File file = new File("scores.txt");
			file.createNewFile();

			FileWriter writer = new FileWriter(file);
			Scanner s = new Scanner(System.in);

			boolean quit;
			do {
				int[] input = new int[3];
				System.out.print("Enter 3 integer bowling scores: ");
				input[0] = s.nextInt();
				input[1] = s.nextInt();
				input[2] = s.nextInt();

				quit = input[0] == -1 && input[1] == -1 && input[2] == -1;
				if (!quit)
					writer.write(input[0] + " " + input[1] + " " + input[2] + "\n");
			} while (!quit);

			writer.close();
			s.close();

			s = new Scanner(file);
			double sum = 0;
			int i = 0;
			while(s.hasNext()) {
				int n = s.nextInt();
				if(i % 3 == 2)
					sum += n;
				i++;
			}
			s.close();
			System.out.println("Average third score: " + sum / (i / 3));

		} catch (IOException ioe) {
			System.out.println("Error: scores.txt could not be opened.");
		}

	}

}

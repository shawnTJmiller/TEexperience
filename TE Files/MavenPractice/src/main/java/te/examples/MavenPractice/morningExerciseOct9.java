package te.examples.MavenPractice;

import java.io.IOException;
import java.util.Scanner;

public class morningExerciseOct9 {

	public static void main(String[] args) throws IOException {
		
		Scanner numberInput = new Scanner(System.in);
		
		boolean valid = true;
		
		while(valid) {
			
			System.out.print("Enter a number: ");
			String input = numberInput.nextLine();
			
			if (input.contentEquals("q") || input.contentEquals("Q")) {
				valid = false;
			}
			try {
				Integer a = Integer.parseInt(input);
			} catch (NumberFormatException letterException) {
				System.out.println("don't do that again.");
			}

			numberInput.close();
		}
		
		
		
	}

	//Actually had time to copy a *working* version!!! WooHoo!!!
	
}

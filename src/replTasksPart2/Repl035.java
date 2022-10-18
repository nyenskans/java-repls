package replTasksPart2;

import java.util.Scanner;

public class Repl035 {

	public static void main(String[] args) {

		/*
		 * LOGICAL OPERATORS
		 * 
		 * For you to do:
		 * 
		 * Create a program that prompt user with question: "Do you need a loan?"(Use a
		 * boolean)
		 * 
		 * If the result is true then prompt user with question:
		 * "What is your credit score?". Otherwise eligibility is "Unknown"
		 * 
		 * Based on the score define users eligibility:
		 * 
		 * if score is below 600 --> eligibility = "Not eligible" if score is between
		 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
		 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
		 * any other previous values --> eligibility = "Definitely eligible" . Output:
		 * 
		 * The eligibility is ____
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Do you need a loan?");

		boolean answer = input.nextBoolean();
		String eligibility = null;

		if (answer) {
			System.out.println("What is your credit score?");
			int creditScore = input.nextInt();
			if (creditScore < 600) {

				eligibility = "Not eligible";

			} else if (creditScore >= 600 && creditScore <= 700) {

				eligibility = "Maybe eligible";

			} else if (creditScore >= 701 && creditScore <= 800) {

				eligibility = "Eligible";

			} else if (creditScore > 800) {

				eligibility = "Definitely eligible";

			}
		} else {
			eligibility = "Unknown";

		}

		System.out.println("The eligibility is " + eligibility);
		input.close();

	}

}

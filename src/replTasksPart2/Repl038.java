package replTasksPart2;

import java.util.Scanner;

public class Repl038 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Prompt user with a question: "Is it weekend?"
		 * 
		 * If it is not a weekend --> subject="manual testing"
		 * 
		 * Otherwise --> subject="Java"
		 * 
		 * Output:
		 * 
		 * Today you will be learning ____
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Is it weekend?");

		boolean weekend = input.nextBoolean();
		String subject;
		if (!weekend) {
			subject = "manual testing";

		} else {
			subject = "Java";
		}
		System.out.println("Today you will be learning " + subject);
		input.close();

	}

}

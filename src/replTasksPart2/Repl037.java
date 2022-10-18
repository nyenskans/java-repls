package replTasksPart2;

import java.util.Scanner;

public class Repl037 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?"
		 * 
		 * "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=water
		 * 
		 * If user is thirsty and sleepy--> drink=coffee
		 * 
		 * If user is not thirsty and sleepy --> drink=tea
		 * 
		 * Otherwise drink="nothing"
		 * 
		 * Output: Looks like you need to drink ___
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Are you thirsty?");

		boolean thirsty = input.nextBoolean();

		System.out.println("Are you sleepy?");
		boolean sleepy = input.nextBoolean();
		String drink;

		if (thirsty && !sleepy) {
			drink = "water";
		} else if (thirsty && sleepy) {
			drink = "coffee";
		} else if (!thirsty && sleepy) {
			drink = "tea";
		} else {
			drink = "nothing";
		}
		System.out.println("Looks like you need to drink " + drink);
		input.close();

	}

}

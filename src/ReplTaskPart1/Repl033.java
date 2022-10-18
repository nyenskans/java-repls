package ReplTaskPart1;

import java.util.Scanner;

public class Repl033 {

	public static void main(String[] args) {

		/*
		 * NESTED IF
		 * 
		 * For you to do:
		 * 
		 * Ask the user to enter any number
		 * 
		 * if a user enters a number and it is even, print "Value is even", otherwise
		 * print "Value is odd" and prints Odd value is just right
		 * 
		 * If the number is even then check if it is greater than 1000 or not.
		 * 
		 * If the number is greater than 1000, then print "Even value is large", else
		 * print "Even value is just right".
		 * 
		 * Example Output:
		 * 
		 * Please enter a number Value is odd Example Output:
		 * 
		 * Please enter a number Value is odd Odd value is just right
		 */
		System.out.println("Please enter a number");

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		int mod = num % 2;

		if (mod == 0) {
			System.out.println("Value is even");
			if (num > 1000) {
				System.out.println("Even value is large");
			} else {
				System.out.println("Even value is just right");
			}

		} else {
			System.out.println("Value is odd");
			if (num > 1000) {
				System.out.println("Odd value is large");
			} else {
				System.out.println("Odd value is just right");
			}
		}
		input.close();

	}

}

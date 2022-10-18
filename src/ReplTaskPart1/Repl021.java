package ReplTaskPart1;

import java.util.Scanner;

public class Repl021 {

	public static void main(String[] args) {

		/*
		 * SCANNER CLASS For you to do:
		 * 
		 * Write a program that asks the user's age: "Enter your age "
		 * 
		 * Then display it by adding 10 (i.e age + 10) in your final output.
		 * 
		 * Example Output:
		 * 
		 * Enter your age 30 Your age after 10 years is 40
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");

		int age = input.nextInt();

		System.out.println("Your age after 10 years is " + (age + 10));
		input.close();

	}

}

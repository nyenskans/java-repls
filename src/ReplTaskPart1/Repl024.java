package ReplTaskPart1;

import java.util.Scanner;

public class Repl024 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Write a program that takes a user's name and prints it.
		 * 
		 * Example Output:
		 * 
		 * Hello, please enter your name Your name is Sumair
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, please enter your name");

		String name = input.nextLine();

		System.out.println("Your name is " + name);
		input.close();

	}

}

package ReplTaskPart1;

import java.util.Scanner;

public class Repl032 {

	public static void main(String[] args) {

		/*
		 * NESTED IF For you to do:
		 * 
		 * Ask the user to enter his/her gender "Please enter your gender: M or F" and
		 * their age "Please enter your age"
		 * 
		 * You have 2 conditions:
		 * 
		 * If age is above 25, then check if a user entered F then the output should be
		 * "Woman" otherwise it should say "Man"
		 * 
		 * If age is below 25, then check if a user entered F then the output should be
		 * "Girl" otherwise it should say "Boy"
		 * 
		 */
		Scanner input = new Scanner(System.in);
		char gender = input.next().charAt(0);
		int age = input.nextInt();

		System.out.println("Please enter your gender: M or F");
		if (gender == 'M') {
			System.out.println("Please enter your age");
			if (age > 25) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");

			}
		} else {
			System.out.println("Please enter your age");
		}
		if (age > 25) {
			System.out.println("Woman");
		} else {
			System.out.println("Girl");
		}
		input.close();

	}

}

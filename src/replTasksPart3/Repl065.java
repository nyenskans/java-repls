package replTasksPart3;

import java.util.Scanner;

public class Repl065 {

	public static void main(String[] args) {

		/*
		 * Given the following inputs:
		 * int x; 
		 * Write a for loop that will print out a series of numbers starting at
		 * one less than x and ending at 0.
		 */
		int x;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		x=input.nextInt();
		
		for(int i=(x-1); i>=0; i--) {
			System.out.print(i+" ");
		}
		input.close();

	}

}

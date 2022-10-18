package replTasksPart3;

import java.util.Scanner;

public class Repl064 {

	public static void main(String[] args) {

		/*
		 * You should input:
		 * 
		 * int end; Write a for loop that will print out a series of numbers starting at
		 * 0 and ending at the doubled value of end(value must be taken from a user),
		 * exclusive.
		 * 
		 * Each number should be on the same line, separated by a space.
		 * 
		 * 
		 */
		int end;

		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		end=in.nextInt();
		for(int i=0; i<(2*end); i++) {
			System.out.print(i+" ");
		}
		in.close();

	}

}

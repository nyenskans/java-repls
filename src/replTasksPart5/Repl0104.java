package replTasksPart5;

import java.util.Scanner;

public class Repl0104 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Create an array of names that will hold 5 String elements.
		 * Names must be taken from a user.
		 * Print out the first three characters of each element of the array, one per
		 * line.
		 * Note: every array element must be at least 3 characters long 
		 */

		Scanner input=new Scanner(System.in);
System.out.println("Enter any names:");
		  String[] names=new String[5];

		  for(int i=0; i<names.length; i++) {
			  
			  names[i]=input.nextLine();
			  System.out.println(names[i].substring(0,3));
		  }

		input.close();
		
	}

}

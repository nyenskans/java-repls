package replTasksPart5;

import java.util.Scanner;

public class Repl0095 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Using Scanner class input string value. 
		 * Print out the following: "The first 3 letters of ___ is ___"* 
		 * For example, if the input is "banana", your output should be:
		 * "The first 3 letters of banana is ban".
		 */
		
		
		Scanner input=new Scanner(System.in);
		
		String word=input.nextLine();
		String str1=word.substring(0,3);
		System.out.println("The first 3 letters of "+word+" is "+ str1);
		input.close();
}

}

package replTasksPart5;

import java.util.Scanner;

public class Repl0101 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Inputs:
		 * 
		 * String word; Write a for loop that will print out every other letter in a
		 * String, starting with the first letter. These letters should be printed all
		 * on one line with no space in between.
		 * 
		 * Sample input/outputs
		 * In: hello hlo 
		 * In: SSyynnttaaxxTTeecchhnnoollooggiieess
		 *  SyntaxTechnologies
		 */
		
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("In:");
	    String word = input.nextLine();
	    //write your code below
	   char everyOther;
	    for(int i=0; i<word.length(); i+=2) {
	    	everyOther=word.charAt(i);
	    	System.out.print(everyOther);
	    }System.out.println();
	    
	    
	    
	    
	    
	    input.close();
	}

}

package replTasksPart5;

import java.util.Scanner;

public class Repl0102 {

	public static void main(String[] args) {

		/*
		 * Inputs:
		 * 
		 * String word; Write a for loop that will loop through every character of a
		 * word and print out each character, each on a separate line
		 * 
		 * Sample inputs/outputs:
		 * 
		 * In: hello 
		 * h
		 * e
		 * l  
		 * l
		 * o
		 */

		 Scanner input = new Scanner(System.in);
		    System.out.print("In:");
		    String word = input.nextLine();
		    //write your code below
		    char word1;
		    
		    for(int i=0; i<word.length(); i++){
		      word1=word.charAt(i);
		      System.out.println(word1);
		    }
		    
		
		input.close();
		
		
	}

}

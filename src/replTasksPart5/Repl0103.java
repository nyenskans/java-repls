package replTasksPart5;

import java.util.Scanner;

public class Repl0103 {

	public static void main(String[] args) {

		/*
		 * Given the following inputs:
		 * 
		 * String s; Write a for loop that will print out each letter of the string s,
		 * separated by spaces, on the same line.
		 * 
		 * Sample input/outputs:
		 * 
		 * In: hello h e l l o
		 */

		 Scanner input = new Scanner(System.in);
		    System.out.print("In:");
		    String s = input.nextLine();
		    //write your code below
		    
		    char s1;
		    
		    for(int i=0; i<s.length(); i++) {
		    	s1=s.charAt(i);
		    	System.out.print(s1+" ");
		    	
		    }
		    input.close();
	}

}

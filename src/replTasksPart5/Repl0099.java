package replTasksPart5;

import java.util.Scanner;

public class Repl0099 {

	public static void main(String[] args) {
		/*
		 * Write code that will take in a String input and check to see if it is a
		 * palindrome or not.
		 * 
		 * A palindrome means that the characters are the same forwards and backwards,
		 * ignoring spaces.
		 *  Examples of palindromes:
		 * 
		 * racecar 
		 * was it a car or a cat I saw 
		 * never odd or even
		 *  rats live on no evil star 
		 *  Your check should be case insensitive too. For example, "Bob" is a
		 * palindrome, despite the first B being capitalized.
		 * Your program will print out "true" if it's a palindrome and "false" if not.
		 */
		
		
		Scanner input=new Scanner(System.in);
		
		boolean Palindrome=true;
		
		String sentence=input.nextLine();
		
		String sentence1=sentence.replace(" ", "");
		String reverse="";
		
		for(int i=sentence1.length()-1; i>=0; i--) {
			reverse+=sentence1.charAt(i);
		}
		
		for(int i=0; i<sentence.length(); i++) {
			if(reverse.equals(sentence1)) {
				Palindrome=true;
			}else {
				Palindrome=false;
			}
		}System.out.println(Palindrome);
		
		
		
		
		
		input.close();
	}

}

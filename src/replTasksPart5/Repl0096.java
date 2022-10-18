package replTasksPart5;

import java.util.Scanner;

public class Repl0096 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * You have Scanner class to input string value. 
		 * If language is Java it should print the:
		 * "Java is a programming language".
		 * If language is C it should print the: 
		 * "C is a procedural programming language" 
		 * If language is C++ it should print the:
		 * "C++ is a middle-level programming language" 
		 * If any other should print: 
		 * "Doesn't match any programming language"
		 */
		
		
		 Scanner input = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = input.nextLine(); 
		  
		   if(language.equalsIgnoreCase("Java")) {
			   System.out.println(language+" is a programming language");
		   }else if(language.equalsIgnoreCase("C")) {
			  System.out.println(language+" is a procedural programming language" ); 
		   }  else if(language.equalsIgnoreCase("C++")) {
			   System.out.println(language+" is a middle-level programming language");
		   }else {
			   System.out.println("Doesn't match any programming language");
		   }
			   
			   
			   
			   
			   input.close();
		   
	}

}

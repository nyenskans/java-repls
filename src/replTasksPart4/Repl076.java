package replTasksPart4;

import java.util.Scanner;

public class Repl076 {

	public static void main(String[] args) {


//		For you to do:
//
//			Write a program that creates a String array with size 7.
//			Ask the user to input Days of a week beginning with Sunday using Scanner class.
//			Add these inputs to your array and then print all values from that array
//			Example:
//			Please enter day 1 of the week
//			Sunday
//			Please enter day 2 of the week
//			Monday
//			Please enter day 3 of the week
//			Tuesday etc
		
		Scanner input=new Scanner(System.in);
		
		
		String[] array= new String[7];
	    
	    System.out.println("Please enter day 1 of the week");
	      array[0]=input.nextLine();
	        System.out.println("Please enter day 2 of the week");
	      array[1]=input.nextLine();
	  System.out.println("Please enter day 3 of the week");
	      array[2]=input.nextLine();
	        System.out.println("Please enter day 4 of the week");
	      array[3]=input.nextLine();
	System.out.println("Please enter day 5 of the week");
	      array[4]=input.nextLine();
	        System.out.println("Please enter day 6 of the week");
	      array[5]=input.nextLine();
	 System.out.println("Please enter day 7 of the week");
	      array[6]=input.nextLine();

	    for(int i=0; i<array.length; i++){
	      System.out.println(array[i]);
	    }
		input.close();

	}

}

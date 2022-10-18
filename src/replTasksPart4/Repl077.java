package replTasksPart4;

import java.util.Scanner;

public class Repl077 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Create an array of integers that will store 5 elements taken from a user
		 * 
		 * Don't print any prompt message for the user
		 * 
		 * Then print out all the elements you have created in the first loop in reverse
		 * order.
		 */

		Scanner input=new Scanner(System.in);
		int[] array=new int[5];
		  array[0]=input.nextInt();
		  array[1]=input.nextInt();
		  array[2]=input.nextInt();
		  array[3]=input.nextInt();
		  array[4]=input.nextInt();
		 
		  for(int i=array.length-1; i>=0; i--){

		    System.out.println(array[i]);
		  }
			input.close();

	}

}

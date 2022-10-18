package replTasksPart4;

import java.util.Scanner;

public class Repl078 {

	public static void main(String[] args) {

		/* 	ARRAYS
		 * For you to do:
		 * 
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner.
		 *  Don't print prompt questions for a user.
		 *  Using loop print out each element of the array that should look like the
		 * output below
		 * Example:
		 * Input:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * Output: 10 20 30 40 50
		 */

		int[] array=new int[5];
		Scanner input=new Scanner(System.in);
		array[0]=input.nextInt();
		array[1]=input.nextInt();
		array[2]=input.nextInt();
		array[3]=input.nextInt();
		array[4]=input.nextInt();

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]*10);
		}
		
		input.close();

	}

}

package replTasksPart4;

public class Repl071 {

	public static void main(String[] args) {

		/*	ARRAYS
		 * 
		 * For you to do:
		 * 
		 * Write a program that creates an array of integers that stores the following
		 * values: 45,78, 12, 67, 55, 89, 23, 77, 88
		 * 
		 * Print only values that stored with even index including 0.
		 * 
		 * Output:
		 * 
		 * 45 12 55 23 88
		 */

		int[] array= {45, 78, 12, 67, 55, 89, 23, 77, 88};
		  
		for(int i=0; i<array.length; i+=2) {
			System.out.print(array[i]+" ");
		}
		
		
	}

}

package replTasksPart4;

public class Repl075 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Using the following array.
		 * 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88}
		 * 
		 * Create a for loop to extract values from that array so your output looks as
		 * below:
		 ** 
		 * Expected Output:** 78 55 77 
		 * Note: Find out what is the start point and how
		 * much you need to increment to get the result.
		 * 
		 */

		
		int[] array={45, 78, 12, 67, 55, 89, 23, 77, 88};
		
		for(int i=1; i<8; i+=3) {
			System.out.print(array[i]+" ");
		}
	}

}

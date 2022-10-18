package replTasksPart4;

public class Repl074 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Write a program that creates an array of integers of size 11. Add the years
		 * 2010 to 2020 to your array one by one using a for loop and then print all
		 * those values.
		 */
	
			int[] array=new int[11];
			
			array[0]=2010;
			array[1]=2011;
			array[2]=2012;
			array[3]=2013;
			array[4]=2014;
			array[5]=2015;
			array[6]=2016;
			array[7]=2017;
			array[8]=2018;
			array[9]=2019;
			array[10]=2020;
			
			for(int i=0; i<11; i++) {
				
						System.out.println(array[i]);
	
			}
			
	}

}

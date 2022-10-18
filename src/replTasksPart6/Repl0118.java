package replTasksPart6;

public class Repl0118 {

	/*
	 * Write a method header on line two with the following specs:
	 * 
	 * Returns:
	 * 
	 * a String Name:
	 * 
	 * spaceOut Parameters:
	 * 
	 * a String Then complete the method by programming the following behavior
	 * 
	 * Insert spaces after every character in the String s, then return the new
	 * string.
	 * See below examples (note the space at the end as well).
	 */

	static String spaceOut(String a) {
		a = a.replaceAll(".(?!$)", "$0 "); // this means replace each character with itself plus space
		return a;
	}

	public static void main(String[] args) {
		System.out.println(spaceOut("hello"));
		System.out.println(spaceOut("technology"));
	}
}

package replTasksPart5;

import java.util.Scanner;

public class Repl0097 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Based on the user inputs program should give a correct answer.
		 * If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
		 * "Proceed with Chrome browser" 
		 * If browser is firefox, FIREFOX or FireFOX it should print the:
		 * "Proceed with Firefox browser"
		 * If browser is IE, ie or iE it should print the:
		 * "Proceed with IE browser"
		 * If any other browser it should print the:
		 * "Invalid browser"
		 */
		
		
		   Scanner sc = new Scanner(System.in); 
		    
		    System.out.println("Enter the browser name to proceed further with execution");
		    
		    String browser = sc.nextLine(); 

		    if(browser.equalsIgnoreCase("Chrome")){
		      System.out.println("Proceed with Chrome browser");
		    }
		    if(browser.equalsIgnoreCase("firefox")){
		      System.out.println("Proceed with Firefox browser");
		    }
		    if(browser.equalsIgnoreCase("IE")){
		            System.out.println("Proceed with IE browser");

		    }else{
		            System.out.println("Invalid browser");
  
		            
	}
sc.close();
}
}
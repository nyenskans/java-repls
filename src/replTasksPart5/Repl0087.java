package replTasksPart5;

public class Repl0087 {
	
	// Class should be named car
	// I kept ReplTask0087 for file organization purposes

	String carColor;
	  int carYear;
	  String carMake;
	  
	public static void main(String[] args) {
		
//		For you to do:
//			Create a class named 'Main' with specific attributes.
//
//			Create two objects of that class in which you will be assigning the following values and then print them.
//			carColor='Black'
//			carYear=2019
//			carMake='BMW'
//			carColor='White'
//			carYear=2018
//			carMake='Toyota'
//			Car color is Black and car year is 2019 and car model is BMW
//			Car color is White and car year is 2018 and car model is Toyota
	
		
// Class should be named car
// I kept ReplTask0087 for file organization purposes
		
		Repl0087 bmw=new Repl0087();
		  bmw.carColor="Black";
		  bmw.carYear=2019;
		  bmw.carMake="BMW";
		    
		  Repl0087 toyota= new Repl0087();
		  toyota.carColor="White";
		  toyota.carYear=2018;
		  toyota.carMake="Toyota";

		  System.out.println("Car color is "+ bmw.carColor+" and car year is "+bmw.carYear+"and car model is "+bmw.carMake);
		    System.out.println("Car color is "+ toyota.carColor+" and car year is "+toyota.carYear+"and car model is "+toyota.carMake);
		  
		
		
	}

}

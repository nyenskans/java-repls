package replTasksPart7;

public class Repl0129 {
    //For you to do:
    //Declare two static variables to hold
    //country name
    //continent
    //Create a method to display the value of static variables in the following format:
    //____ located on ____ continent
    //In the main method assign values to a static variable and execute method display
    //Expected Output:
    //Morocco located on Africa continent
}
class Main2 {

    static  String countryName;
    static  String continent;

    static void displayInfo(){
        System.out.println(countryName+" located on "+continent+" continent");
    }

    public static void main(String [] args){
        countryName="Morocco";
        continent="Africa";
        Main2.displayInfo();
    }
}
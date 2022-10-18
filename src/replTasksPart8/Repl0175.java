package replTasksPart8;

public class Repl0175 {
    //Interfaces
    //**Follow Steps Carefully.
    //Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
    //Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
    //Step 3: Inherit both interfaces to Main class.
    //Step 4: Execute both methods
    //Expected Output:
    //First Method implementing multiple Inheritance
    //Second Method implementing multiple Inheritance
}
interface FirstInterface{
    void firstMethod();
}
interface SecondInterface{
    void secondMethod();
}
class Main13 implements FirstInterface , SecondInterface {

    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }
    public void secondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");

    }
    public static void main(String[]args){
        Main13 main=new Main13();
        main.firstMethod();
        main.secondMethod();
    }
}
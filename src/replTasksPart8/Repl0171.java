package replTasksPart8;

public class Repl0171 {
    //Abstraction
    //
    //Create a Parent Class that will have two overloaded abstract methods m1
    //
    //Make Main class as concrete subclass to Parent Class
    //
    //In main method call the methods.
    //
    //Expected Output:
    //
    //m1 without parameters
    //m1 method with parameter
}
abstract class Parent{

    abstract void m1();
    abstract void m1(String name);
}
class Main14 extends Parent{
    void m1(){
        System.out.println("m1 without parameters");
    }
    void m1(String name){
        System.out.println("m1 method with parameters");
    }
    public static void main(String [] args){

        Parent parent=new Main14();

        parent.m1();
        parent.m1("Katarina");
    }
}
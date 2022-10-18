package replTasksPart8;

public class Repl0172 {
    //Abstraction

    //Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
    //Make Main class to be a derived class from Parent.
    //In main method execute both methods
    //Expected Output:
    //Child class providing implementation
    //Parent class providing implementation
}
abstract class Parent1{

    abstract void m1();

    void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class Main1 extends Parent1{

    void m1(){
        System.out.println("Child class providing implementation");
    }
    public static void main(String[]args){

        Parent1 parent=new Main1();
        parent.m1();
        parent.m2();

    }
}
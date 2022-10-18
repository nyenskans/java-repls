package replTasksPart8;

public class Repl0174 {
    //Create an Interface with name as MyInterface
    //Create two undefined methods method1 and method2
    //Inherit the MyInterface to Main Class.
    //Execute both methods
    //
    //Expected Output:
    //implementation of method1
    //implementation of method2
}
interface MyInterface{
    void m1();
    void m2();
}
class Main3 implements MyInterface{
    public void m1(){
        System.out.println("implementation of method1");
    }
    public void m2(){
        System.out.println("implementation of method2");
    }
    public static void main(String[] args){

        Main3 main=new Main3();
        main.m1();
        main.m2();
    }
}
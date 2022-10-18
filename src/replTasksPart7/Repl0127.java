package replTasksPart7;

public class Repl0127 {
//    For you to do:
//    Create two methods:
//    The first method should be a non-static method that will print out the following message:
//            "Programming is amazing."
//    The second method should be a static method that will print out the following message:
//            "Java is awesome."
//    Execute both methods
//    Expected Output:
//    Programming is amazing.
//    Java is awesome.
//

}
class Main1 {

    public void method1(){
        System.out.println("Programming is amazing.");
    }
    public static void method2(){
        System.out.println("Java is awesome.");
    }
    public static void main(String[]args){

        Main1 object1=new Main1();
        object1.method1();
        Main1.method2();

    }
}
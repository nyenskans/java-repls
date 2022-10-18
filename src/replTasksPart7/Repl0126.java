package replTasksPart7;

public class Repl0126 {
//    For you to do:
//       Create a variable that will hold the count of all instances of the Main class
//       Create 3 Object of the class and print value of the count variable;
//      Expected Output:
//      3


}

class Main7 {
    public static int counter=0;
    Main7(){
        counter++;
    }
    public static void main(String[]args){

        Main7 obj1=new Main7();
        Main7 obj2=new Main7();
        Main7 obj3=new Main7();
        System.out.println(counter);
    }
}
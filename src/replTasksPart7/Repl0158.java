package replTasksPart7;

public class Repl0158 {
    //Create Class called Parent.
    //create a String variable called city.
    //create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.
    //create method : access modifier public,return type void, name display
    //Write to logic print below sentence.
    //"City name " + the value of class variable.
    //Create Child Class, inherit to Parent class.
    //Create Child constructor with one String parameter called city.
    //call super constructor and pass the parameter.
    //in Main Class:
    //Create an object of Child class. pass city name as "Fairfax" and call the display method.
    //Output:City name Fairfax
}
class Parent{
    String city;
    Parent(String city){
        this.city=city;
    }
    public void display(){
        System.out.println("City name " + city);
    }
}
class Child extends Parent{
    Child(String city){
        super(city);
    }
}
class Main9 {
    public static void main(String [] args){

        Child child=new Child("Fairfax");
        child.display();
    }
}
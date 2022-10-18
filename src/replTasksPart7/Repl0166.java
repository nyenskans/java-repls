package replTasksPart7;

public class Repl0166 {

}
class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    void eat(){
        System.out.println(type+" eats");
    }
    void sleep(){
        System.out.println(type+" sleeps");
    }
}class Cat extends Animal{

    Cat(String type){
        super(type);
    }
    void sleep(){
        System.out.println(type+" sleeps a lot");
    }
}class Kitten1 extends Cat{

    Kitten1(String type){

        super(type);
    }
    void eat(){
        System.out.println(type+" eats milk");
    }

}class Kitten2 extends Cat{

    Kitten2(String type){
        super(type);
    }
    void eat(){
        System.out.println(type+" eats snacks");
    }
}class Kitten3 extends Cat{

    Kitten3(String type){
        super(type);
    }
    void eat(){
        System.out.println(type+" eats everything");
    }
}class Main12 {
    public static void main(String [] args){


       Cat[] cats={new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for(int i=0; i<cats.length;i++){
            cats[i].eat();
            cats[i].sleep();

        }
    }
}
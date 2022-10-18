package replTasksPart9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Repl0194 {
    //For you to do:
    //Create a method that will remove an element based on the specified condition from given List and return new List;
    //Expected Output:
    //[USA, Kazakhstan, Pakistan, Russia]
}
class Main17 {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        for(int i=0; i<countries.size();i++){
            if(countries.get(i).equals("Armenia")||countries.get(i).equals("Azerbaijan")||countries.get(i).equals("Australia")){
                countries.remove(i);
            }
        }
        System.out.println(countries);
    }

    ArrayList<String> removeElements(ArrayList<String> newCountries){



        return new ArrayList<String>();
    }


}


/*    LinkedList<String> removeElement(LinkedList<>()){

        return new LinkedList<String>();
    }*/


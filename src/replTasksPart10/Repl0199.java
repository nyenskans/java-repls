package replTasksPart10;

import java.util.*;

public class Repl0199 {
    //Create a Set collection in which you want to preserve an order of inserted String Objects.
    //Add the below values
    //null
    //Sohil
    //Diego
    //Alijon
    //Asel
    //Sumair
    //Print values 1 by 1 using loop and Iterator
}
class Main4 {
    public static void main(String[] args) {
        Set<String> teachers = new LinkedHashSet<>();
        teachers.add(null);
        teachers.add("Sohil");
        teachers.add("Diego");
        teachers.add("Alijon");
        teachers.add("Asel");
        teachers.add("Sumair");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
        Iterator iterator = teachers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
package replTasksPart10;

import java.util.HashSet;
import java.util.Set;

public class Repl0195 {

    //Create the HashSet with list of Integers add the below numbers for the list
    // 111
    //111
    //111
    //999
    //999
    //999
    //Print elements one by one.
    //Expected Output
    //999
    //111
}class Main{
    public static void main(String[] args) {
        Set<Integer> numbers= new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

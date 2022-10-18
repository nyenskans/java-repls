package replTasksPart10;

import java.util.HashSet;
import java.util.Set;

public class Repl0196 {
    //Create a Set and add below values to it.
    //[third, first, second]
    //Print HashSet and then remove all the elements from Hashset and print it again.
    //Expected Output:
    //[third, first, second]
    //[]
}
class Main1 {
    public static void main(String[] args) {

        Set<String> elements=new HashSet<>();
        elements.add("third");
        elements.add("first");
        elements.add("second");
        System.out.println(elements);
        elements.removeAll(elements);
        System.out.println(elements);
    }

}
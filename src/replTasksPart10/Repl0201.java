package replTasksPart10;

import java.util.HashMap;
import java.util.Map;

public class Repl0201 {
    //Create a Map in which you do not need to preserve the order of the entries
    //Add below pair to it .
    //"Street" = "Patrick ST"
    //"Suite" = "265"
    //"City" = "Vienna"
    //"Zip" = "22180"
    //"Country" = "United State"
    //Find how many entries are inside the map
    //Remove all entires from the Map
    //Find the Map size again
    //Expected Output:
    //5
    //0
}
class Main6{
    public static void main(String[] args) {
        Map<String, String> pairs = new HashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");
        System.out.println(pairs.size());
        pairs.clear();
        System.out.println(pairs.size());

    }
}
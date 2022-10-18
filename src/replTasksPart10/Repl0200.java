package replTasksPart10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Repl0200 {
    //Create A Map that will preserve an order of entry objects: // LinkedHashMap
    //Add below pairs :
    //"Street" = "Patrick ST"
    //"Suite" = "265"
    //"City" = "Vienna"
    //"Zip" = "22180"
    //"Country" = "United State"
    //Print all values of from the map
    //Expected Output:
    //Patrick ST
    //265
    //Vienna
    //22180
    //United State
}
class Main5{
    public static void main(String[] args) {
        Map<String, String> pairs = new LinkedHashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");

        for (String s : pairs.values()) {
            System.out.println(s);
        }
    }
}

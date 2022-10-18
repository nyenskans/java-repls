package replTasksPart10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl0205 {
    //Create a HashMap of String.
    //Add below pair to it .
    //"Street" = "Patrick ST"
    //"Suite" = "265"
    //"City" = "Vienna"
    //"Zip" = "22180"
    //"Country" = "United State"
    //Print all the values in upper case using entrySet
    //Expected Output:
    //265
    //22180
    //PATRICK ST
    //UNITED STATE
    //VIENNA
}
class Main10{
    public static void main(String[] args) {
        Map<String, String> address= new HashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        Iterator<Map.Entry<String, String>> iterator = address.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String value= entry.getValue().toUpperCase();
            System.out.println(value);
        }
    }
}

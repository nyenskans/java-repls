package replTasksPart10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Repl0204 {
    //Create a Map that will preserve an order of entry objects
    //Add below pair to it .
    //"Street" = "Patrick ST"
    //"Suite" = "265"
    //"City" = "Vienna"
    //"Zip" = "22180"
    //"Country" = "United State"
    //Print all values using iterator
    //Expected output:
    //Patrick ST
    //265
    //Vienna
    //22180
    //United State
}
class Main9{
    public static void main(String[] args) {
        Map<String, String> address = new LinkedHashMap<>();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");
        /*
        Iterator iterator = address.values().iterator();
         while(iterator.hasNext()){
         System.out.println(iterator.next);
         }
         */
        Iterator<Map.Entry<String, String>> iterator =address.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry =iterator.next();
            String key= entry.getKey();
            String value= entry.getValue();
            System.out.println(value);
       }

        Iterator iterator1 = address.values().iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
package replTasksPart10;

import java.util.HashMap;
import java.util.Map;

public class Repl0206 {
    //Create a Hash Map of String pairs
    //add the follow values
    //map.put("ONE","AAA");
    //map.put("TWO","BBB");
    //map.put("THREE","CCC");
    //map.put("FOUR","DDD");
    //map.put("FIVE","EEE");
    //Using entry set print key and values pairs using loop
    //Remove below from Map
    //"ONE"
    //"FOUR"
    //Using entry set print key and values pairs using loop
}
class Main11{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);

        }
        map.remove("ONE");
        map.remove("FOUR");

        System.out.println("------------------");

        System.out.println("HashMap After Remove :");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }


    }
}
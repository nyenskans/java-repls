package replTasksPart7;

public class Repl0128 {
//    Create a static method with the following specification
//    Return Type: String
//    Method Name: mixString
//    Parameters:
//    a String called s1
//    a String called s2
//    Then inside method write logic that will return the strings combined, one letter at a time, starting with s1. See example below for an example.
//    NOTE: s1 and s2 should be of equal lengths:

    //s1 ==> "12345"
    //s2 ==> "abcde"


}
class Main3 {

    static String mixString(String s1, String s2){
        s1="12345";
        s2="abcde";
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s1.length();i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));

        }
        String result=sb.toString();

        return result;

    }

    //test case below (don't change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }


}
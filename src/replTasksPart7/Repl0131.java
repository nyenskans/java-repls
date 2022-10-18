package replTasksPart7;

public class Repl0131 {
    //Write a method header on line two with the following specs:
    //Returns:
    //a String
    //Name:
    //thirdLetter
    //Parameters:
    //a String called s
    //Then complete the method by programming the following behavior
    //Returns every 3rd letter of the String s,
    //starting from the first letter.
    //See below examples.
    //Examples:
    //thirdLetter("hello there") ==> "hltr"
    //thirdLetter("technology") ==> "thly"
}
class Main6 {
    public static String thirdLetter(String s){

        String newString="";

        char[] c= s.toCharArray();

        for(int i=0; i<s.length();i+=3){
            newString+=c[i];
        }
        return newString;
    }


    //test case below (don't change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
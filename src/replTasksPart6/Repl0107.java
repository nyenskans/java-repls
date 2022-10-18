package replTasksPart6;

public class Repl0107 {
    //How would you reverse a String using StringBuffer Class
    //Given String = "Hello Friends"
    //Expected Output:
    //sdneirF olleH

    public static void main(String[] args) {

        String givenString="Hello Friends";

        StringBuffer stringBuffer = new StringBuffer(givenString);
        StringBuffer reverseString = stringBuffer.reverse();
        System.out.println(reverseString);
    }
}

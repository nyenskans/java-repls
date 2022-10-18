package replTasksPart7;

public class Repl0133 {
//    Create a static method with the following specs:
//   Returns: an integer
//    Name: countA
//    Parameters:
//    a String called s
//    Purpose:
//     count the number of occurrences of 'a' or 'A' within s
}
class Main11 {

    public static int countA(String s){
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='A'){
                count++;
            }
        }return count;
    }

    //test case below (don't change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
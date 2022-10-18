package replTasksPart9;
import java.util.Scanner;
import java.util.ArrayList;
public class Repl0188 {
    //Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
    //Numbers in:
    //4
    //62
    //8
    //5
    //4
    //Expected Output: 4 62 8 5 4
}

class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        for(int i=0; i<5;i++){
            int number=input.nextInt();
            list.add(number);

        }
        // System.out.println(list);

        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        } System.out.println();

        input.close();
    }
}
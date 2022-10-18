package replTasksPart9;

import java.util.LinkedList;

public class Repl0190 {
    //Create Linked List that will store first 10 numbers of fibonacci series
    //Print number from Linked List 1 by 1 all in 1 line
    //Expected Output:
    //0 1 1 2 3 5 8 13 21 34
}
class Main13 {
    public static void main(String[] args){

        LinkedList<Integer> list=new LinkedList<>();
        // 0 1 1 2 3 5 8 13 21
        int a = 0;
        int b = 0;
        int c = 1;
        list.add(b);
        list.add(c);

        for(int i = 1; i <= 7; i++)
        {
            a = b;
            b = c;
            c = a + b;
            list.add(c);
        }
        System.out.println(list);

        // alternative printing
        //   for(int i=0; i<list.size();i++)  {
        //      System.out.print(list.get(i)+" ");
        //    }
        //       System.out.println();
    }
}

package replTasksPart7;

public class Repl0130 {
//    For you to do:
//      Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.
//     If the number is even, divide it by 2. If it's odd, multiply it by 10.
//    Expected Output:
//     10 1 30 2 50
}
class Main4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{

        int[]b=new int [array.length]; // we can do without it

        for(int i=0; i<array.length;i++){

            if(array[i]%2==0){
                b[i]=array[i]/2;        // instead of this do: sout(array[i]/2+" ")
            }else{
                b[i]=array[i]*10;   // instead of this do: sout(array[i]*10+" ")
            }System.out.print(b[i]+" ");
        }System.out.println();

    }
    }

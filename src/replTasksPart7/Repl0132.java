package replTasksPart7;


public class Repl0132 {
//For you to do:
//Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
//The method should static and it should return a new 2D array object
//Print values from new array in the format below input
//1 2 3 4
//4 5 6 7
//1 3 5 7
//Expected Output:
//-9 -8 -7 -6
//-6 -5 -4 -3
//-9 -7 -5 -3
}
class Main {
    //create method reduce10 here
    static int[][] reduce10(int [][] a){
        int [][] array={{1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}};
        int[][] b=new int[3][4];
        for(int i=0;i<array.length; i++){
            for(int j=0; j<array[i].length;j++){
                b=new int[array.length][array[i].length];
                b[i][j] =(array[i][j]-10);
            }
        }return b;
    }
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        a = reduce10(a);
        //print the elements from new array
    }
}

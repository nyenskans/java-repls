package replTasksPart4;

public class Repl069Wrong {

	public static void main(String[] args) {
		/*
		 * 
		 * Nested For loops
		Write a program to print out the pattern:

		Expected output:

		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
*/

//		int[][] array={{1,2,3,4,5,6,7}, 
//                {1,2,3,4,5,6},
//                {1,2,3,4,5},
//                {1,2,3,4},
//                {1,2,3},
//                {1,2},
//                {1}};
// 
//for(int i=0; i<array.length; i++){
//  for(int j=0; j<array[i].length; j++){
//  System.out.print(array[i][j]+" ");
//  
//
//    }      System.out.println();
//}    
//for(int i=array.length-2; i>=0; i--){
//  for(int j=0; j<array[i].length; j++){
//  System.out.print(array[i][j]+" ");
//  
//
//    }      System.out.println();
//}    
//
// 
		for(int i = 0; i <7; i++)
		{
		for (int j = 1;j<=7-i;j++)
		{
		System.out.print(j+" ");
		
		}
		System.out.println();
		}
		for(int x=1; x<=6; x++) {
			for(int v=1; v<=x+1; v++ ) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		
		
	}

}

package replTasksPart4;

public class Repl067 {

	public static void main(String[] args) {

/*
 * Write a program to print out the pattern:

1 2 3 4 5 6 7 8 9 10

2 4 6 8 10 12 14 16 18 20

3 6 9 12 15 18 21 24 27 30

4 8 12 16 20 24 28 32 36 40

5 10 15 20 25 30 35 40 45 50

 */
		
		

		for(int i=1; i<=10; i++){
			  System.out.print(i+" ");
			}
			    System.out.println();

			for(int j=2; j<=20; j+=2){
			  System.out.print(j+" ");
			}
			    System.out.println();

			    for(int k=3; k<=30; k+=3){
			  System.out.print(k+" ");
			}
			    System.out.println();
			for(int l=4; l<=40; l+=4){
			  System.out.print(l+" ");
			}
			    System.out.println();
			        
			for(int m=5; m<=50; m+=5){
			  System.out.print(m+" ");
			}
			    System.out.println();
		
		// I think it should be done using arrays and nested for loops
		
		
	}

}

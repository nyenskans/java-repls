package replTasksPart4;

public class Repl068Wrong {

	public static void main(String[] args) {

	
	
	char[][] array = {  { '$', '$', '$', '$' }, 
						{ '$', '$', '$', '$' },
						{ '$', '$', '$', '$' },
						{ '$', '$', '$', '$' } };
	
	for (int i = 0; i < array.length; i++) {
	
		for (int j = 0; j < array[i].length; j++) {
	
		
			if ((i == 1 && j == 1) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2)) {
				
				System.out.print(" ");
				continue;
			
			
			}
	
			System.out.print(array[i][j]);
	}
		System.out.println();

}
		
	
	
	
	
	
	
	
	}
}


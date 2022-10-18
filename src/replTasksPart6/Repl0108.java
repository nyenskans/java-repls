package replTasksPart6;

public class Repl0108 {
	/*
    Write a method header with the following specs:
    Returns:
    a String
    Name:
    censorLetter
    Parameters:
    a String
    a char
    Then complete the method by programming the following behavior
    Replace all instances of given character with a "*" within the given String.
    See below examples.
    Examples:
    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
		public static String censorLetter(String word, char c){
			return word.replace(c,'*');
		}

		public static void main(String[]args){
			System.out.println( Repl0108.censorLetter("computer science",'e'));
			System.out.println( Repl0108.censorLetter("trick or treat",'t'));
		}
	}



package replTasksPart7;

public class Repl140 {
}
    class Main8 {

        public static void main(String[] args) {
            String[] arr = {"hey","yolo","hi","this is long"};
            System.out.println(maxLength(arr));
            //should print "this is long"
        }

        public static String maxLength(String[] words){
            String longestWord=words[0];
            for(int i=0; i<words.length;i++){
                for(int j=0; j<words[i].length();j++){
                    if(words[i].length()>longestWord.length()){
                        longestWord=words[i];
                    }
                }
            }return longestWord;



        }
    }


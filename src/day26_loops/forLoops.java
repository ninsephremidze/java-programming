package day26_loops;

public class forLoops {
    public static void main(String[] args) {
        String word = "javaa";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i < word.length();i++ ) {
            if(word.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("There are " + count + " " + letter +"'s in " + word);


    }
}



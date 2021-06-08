package day24_stings;

/**abcd
 *
 */
public class Alphabet {
    public static void main(String[] args) {
        char letter = 'z';
        System.out.println("letter=" + letter);
        letter++;
        System.out.println("letter = " + letter);
        while (letter <= 'z') ;
        {
            System.out.println(letter + " ");
            letter++;


        }
        // reverse order now
        while (letter >= 'z') {
            System.out.println("letter: " + letter + " ");
            letter--;


        }

    }
}
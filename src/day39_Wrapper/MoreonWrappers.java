package day39_Wrapper;

public class MoreonWrappers {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.5, 23.9));
        System.out.println(Double.min(34535.2, 878));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX VALUE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));    //1 --> first number is bigger than second number
        System.out.println(Double.compare(5, 5));    //0 --> first number equals second number
        System.out.println(Double.compare(5, 45));   //-1 --> first number is smaller than second number

        System.out.println(Character.isDigit('8')); //true
        System.out.println(Character.isDigit('v'));//false
        System.out.println(Character.isAlphabetic('c'));//true
        System.out.println(Character.isUpperCase('r'));//false
        System.out.println(Character.isLetter('T'));//true
        System.out.println(Character.isLetter('9'));//false
        char letter = 'A';

        if (Character.isUpperCase(letter)) {
            System.out.println(letter + " is uppercase");
        }

        String word = "JaVa is FuN";

        for (int i = 0; i < word.length() - 1; i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                System.out.print(word.charAt(i) + " ");
            }
        }
    }
}


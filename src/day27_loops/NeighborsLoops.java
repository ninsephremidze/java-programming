package day27_loops;

public class NeighborsLoops {
    public static void main(String[] args) {
        String word = "jaaaaavaa spoonn";
        for (int index = 0; index < word.length(); index++) {
            System.out.println(word.charAt(index));
            System.out.println(word.charAt(index + 1));
            //  for (int index = 0; index < word.length() - 1; index++) {
            //    System.out.print(word.charAt(index));
            //  System.out.println(word.charAt(index + 1));
            // }

        }

    }
}



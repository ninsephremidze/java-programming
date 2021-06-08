package day22_string_manipulation;

public class RevereUseingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        //avaj reverse order
        word = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
char first = (word.charAt(0));
     char second = (word.charAt(1));
       char third = (word.charAt(2));
      char fourth = (word.charAt(3));
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));

        String word2= (""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        System.out.println("word="+word);
        System.out.println("word2="+word2);
        if(word.equalsIgnoreCase(word2)) {
            System.out.println("palendrome word");
        } else{
            System.out.println("not paledrome");

        }

    }
}

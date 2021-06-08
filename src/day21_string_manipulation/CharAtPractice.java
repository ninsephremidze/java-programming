package day21_string_manipulation;

public class CharAtPractice {
    public static void main(String[] args) {
       String word1 = "mom";
        char first1 = word1.charAt(0);
        char last = word1.charAt(2);

        if (first1 == last){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");

String friend="aziza";
char firstLetter=friend.charAt(0);
            char lastletter = friend.charAt(friend.length() - 1);
            System.out.println(firstLetter);
            System.out.println(lastletter);

            if(firstLetter==lastletter) {
                System.out.printf(friend + "first and Last match");
            }else{
                System.out.println(friend+" something else");
            }
        }
    }
}

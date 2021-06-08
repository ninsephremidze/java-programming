package day24_stings;
import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random=new Random();
       // have a randome number System.out.println(random.nextInt(101));
        Scanner scan=new Scanner(System.in);
        int SecretNumber=random.nextInt(101);
      int guessingNumber=0;
      do {
          System.out.println("guess the secret number");
          guessingNumber = scan.nextInt();
      }while(SecretNumber!=101);
        System.out.println("congrats"+SecretNumber);
      }



    }


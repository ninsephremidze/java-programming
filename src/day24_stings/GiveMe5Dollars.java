package day24_stings;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give me 5 dollars");
        int dollars=scan.nextInt();
        while(dollars !=5){
            System.out.println("give me 5 dollars");
            dollars=scan.nextInt();
            dollars--;



        }
        System.out.println("thank you for 5 dollars");

    }
}

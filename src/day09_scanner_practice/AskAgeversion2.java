             package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeversion2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how old are you?");
        int age=scan.nextInt();
        System.out.println(age+"   thats great age!");
scan.close();

    }
}

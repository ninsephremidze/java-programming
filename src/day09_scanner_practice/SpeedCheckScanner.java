package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter current speed");
        int currentSpeed=scan.nextInt();
        int speedLimit=55;
        int overTheLimit= currentSpeed-speedLimit;
        System.out.println("you are driving"+overTheLimit+ "mph over the limit. Slow down");


    }
}

package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your hourly rate");
        double hourly=scan.nextDouble();// as if i typed 50
        double hourlyRate=54.5;
        double weeklyPay= hourlyRate*40;
        double monthlyPay= weeklyPay*53/12;
        System.out.println("Weekly pay:"+ weeklyPay);
        System.out.println( "Monthly pay"+ monthlyPay);


    }
}

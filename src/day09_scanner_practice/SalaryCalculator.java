package day09_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your hourly rate");
        double hourlyRate=54.5;
        double weeklyPay= hourlyRate*40;
        double monthlyPay= weeklyPay*53/12;

        System.out.println("Weekly pay:"+ weeklyPay);
        System.out.println( "Monthly pay"+ monthlyPay);

    }
}

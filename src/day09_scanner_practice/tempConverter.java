package day09_scanner_practice;
import java.util.Scanner;
public class tempConverter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("############# F to C Converter#######");
        // ask to enter F message
        System.out.println("Enter Fahrenheit");
       double FahrenheitValue=scan.nextDouble();
        double celciusValue=(FahrenheitValue-32)*5/9;
        System.out.println(FahrenheitValue+"F in C"+ +celciusValue);


    }
}

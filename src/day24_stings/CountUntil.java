package day24_stings;
import  java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number to count until");
        int numberToStop=scan.nextInt();
        int start=1;
        while(start<=numberToStop){
            System.out.println(start+"");
            start++;
        }

    }
}


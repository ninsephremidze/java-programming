package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1=1;
        num1++;
        ++num1;
        System.out.println(num1);
        int num2=5;
        num2--;
        --num2;
        System.out.println(num2);
        //pre increment
        int num3=10;
        int num4=++num3;
        System.out.println("num1="+num1);//11
        System.out.println("num2="+ num2);//11

       //post increment
        int num5=4;
        int num6=num5;
        //num5++;
       // int num6=num5++;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        
        int apples=5;
        int basket=++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int a=50;
        int b=22;
        int c=a++ + ++b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);







    }
}

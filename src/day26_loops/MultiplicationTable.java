package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 2;
        for (int i = 1; i <= 10; i++)

            System.out.println(number + "x" + i + "=" + (number * i));
//        System.out.println(i);
        /*System.out.println(number + "x" + 1 + "=" + number * 1);
        System.out.println(number + "x" + 2 + "=" + number * 2);
        System.out.println(number + "x" + 3 + "=" + number * 3);
        System.out.println(number + "x" + 4 + "=" + number * 4);
        System.out.println(number + "x" + 5 + "=" + number * 5);
        System.out.println(number + "x" + 6 + "=" + number * 6);
        System.out.println(number + "x" + 7 + "=" + number * 7);
        System.out.println(number + "x" + 8 + "=" + number * 8);
        System.out.println(number + "x" + 9 + "=" + number * 9);

         */
        int num = 2;
        if (num > 10 || num < 1) {
            System.out.println("Number not part of the multiplication table!");
        } else {
            for (int i = 1; i <= 10; i++) {
                int sum = num * i;
                System.out.println(num + " x " + i + " = " + sum);


            }
        }
    }
}


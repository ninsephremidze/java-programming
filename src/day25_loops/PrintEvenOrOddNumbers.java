package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 100; i++) {
            if(i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println();

        for(int i=1 ; i<= 100; i++) {
            if(i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }
    }
}

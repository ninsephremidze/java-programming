package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int k = 1; k <= 10; k++) {
                System.out.print("\t" + k + "x" + i + "=" + i * k);
            }
        }
    }
}

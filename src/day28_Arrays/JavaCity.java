package day28_Arrays;

public class JavaCity {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int day = 1; day <= 30; day++) {
            if (day % 7 != 0) {
                totalCases += 200;
            } else if (day % 7 == 0) {
                totalCases += 500;
            }
        }
        System.out.println("totalCases = " + totalCases);
    }
    }


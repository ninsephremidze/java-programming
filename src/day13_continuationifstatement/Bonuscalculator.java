package day13_continuationifstatement;

import sun.lwawt.macosx.CSystemTray;

public class Bonuscalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.36;

        if (salesAmount <= 1000) {
            System.out.println("great job");
            bonus = 50;
        } else {
            System.out.println("no bonus for you");
            bonus = 100;

            System.out.println("bonus" + bonus);


        }
    }
}

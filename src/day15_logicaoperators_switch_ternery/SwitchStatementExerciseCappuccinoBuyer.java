package day15_logicaoperators_switch_ternery;

public class SwitchStatementExerciseCappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0.0;
        int calories = 0;


        if (size.equals("tall")) {
            switch (size) {
                case "tall":
                    System.out.println("whatever");
                    price=3.69;
                    calories=90;
                    break;
                case "grande":
                    System.out.println("meow");
                    price=3.99;
                    calories=120;
                    break;
                case "venti":
                    price=4.29;
                    calories=150;
                    System.out.println("cappuchino");
                    break;
                default:
                    System.out.println("yummy" + size);
                    System.out.println(price+"total");
                    System.out.println(calories+"hello");

            }
        }
    }
}


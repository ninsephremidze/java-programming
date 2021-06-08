package day17_ternary;

public class NestingIF {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "coke";
        String snack = "chips";
        if (selection.equals("drink")){
            if (drink.equals("coke")){
                System.out.println("coke selected");
            }else{
                System.out.println("Tea is selected");
            }if (snack.equals("chips")){
                System.out.println("Chips selected");
            }else{
                System.out.println("candy item is selected");
            }
        }
    }
}

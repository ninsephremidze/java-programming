package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit=55;
        int currentSpeed=45;
        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);

        boolean isSpeeding=currentSpeed>speedLimit;
        System.out.println("are you speeding?-"+isSpeeding);
        System.out.println("currentSpeed = " +currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed+=20;

        double accountBalance=250.25;
        double itemPrice=100.99;
        System.out.println(accountBalance>=itemPrice);//true
        System.out.println("can I afford--"+(accountBalance>=itemPrice));
       boolean canAfford=accountBalance>=itemPrice;
        System.out.println("can afford"+canAfford);





    }
}

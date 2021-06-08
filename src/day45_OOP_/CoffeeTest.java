package day45_OOP_;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        // NOT : myCoffee.type = "Turkish coffee"; INSTEAD using a method:
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        Coffee coffee1=new Coffee();
        coffee1.setType("cappucino");
        System.out.println("coffee1 type="+ coffee1.getType());
        //assign coffee1 object to coffee 2;
        //hey java , point coffee 2 to same object as coffee1

        Coffee coffee2=coffee1;
        System.out.println("coffee 2 type="+coffee2.getType());
        coffee2.setType("espresso");
        Coffee coffee3=new Coffee();
        coffee3.setType("frappuchino");
        //point to same object as coffee2
        coffee3=coffee2;
        System.out.println("coffee3 type="+coffee3.getType());

        Coffee coffee4=null;
        coffee4.setType("turkish");




    }
}


        //ADD ANOTHER COFFEE OBJECT , SET VALUES, CALL METHODS

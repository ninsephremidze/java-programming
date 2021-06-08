package day15_logicaoperators_switch_ternery;

public class ORstatement {
    public static void main(String[] args) {

        int apples=5;
        int oranges=7;
        System.out.println(apples>3||oranges>4);


        if(apples>3||oranges>4) {
            System.out.println("no need to buy more");
        }else{
            System.out.println("buy more");

        }
    }
}


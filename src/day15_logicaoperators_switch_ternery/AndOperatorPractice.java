package day15_logicaoperators_switch_ternery;

public class AndOperatorPractice {
    public static void main(String[] args) {
        //location, salary, remote,benefits,company
        String location = "Honolulu";
        double salary = 120000;
        boolean remote = true;
        boolean benefits = true;
        if (location.equals("Honolulu") && salary >= 120000 && remote && benefits) ;
        System.out.println("I will accept the offer");
 //   }else{
        System.out.println("lets negotiate");
    }
}

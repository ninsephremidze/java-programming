package day20_string_manipulation;

public class ContainsStringManipulationPractice {
    public static void main(String[] args) {
        String email = "alihantamer01@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("This e mail contains @ and end with.com");
        }else{
            System.out.println("This email is not contains @ || not end with .com");
        }
    }
}

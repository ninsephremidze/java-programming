package day20_string_manipulation;

public class ContainsString {
    public static void main(String[] args) {

        String word="java";
        System.out.println(word.contains("v"));
        System.out.println(word.contains("jv"));
        System.out.println(word.contains("Ja"));
        System.out.println(word.contains(" "));

        String firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("e")) {
        }else{
            System.out.println("nor a or i is present");


            String email = "alihantamer01@gmail.com";
            if(email.contains("@") && email.endsWith(".com")){
                System.out.println("This e mail contains @ and end with.com");
            }else{
                System.out.println("This email is not contains @ || not end with .com");
            }
        }
    }
}

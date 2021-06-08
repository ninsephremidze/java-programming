package day19_class_vs_objec_strings;

public class wordLength {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.length());

        String name="Ephremidze";
        System.out.println(name.length());


        String password="abcde";
        if(password.length() >= 6){
            System.out.println("Invalid Password");
        }else if(password.length() <= 6){
            System.out.println("Password too short");
        }
        String country="usa";
        if(country.equals(country.toUpperCase()));
    }
}

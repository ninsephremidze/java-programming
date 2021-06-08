package day24_stings;

import java.util.Locale;

public class ChainStringMethods {
    public static void main(String[] args) {
        String word="woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove spaces first, then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());
      //  selenium.findElement(By.id("hi")).click();--- selenium practice

        String city="Boston";
    }
}

package day19_class_vs_objec_strings;


import java.sql.SQLOutput;
import java.util.Locale;

public class CaseConversion {
    public static void main(String[] args) {
/*
        String word="nina";
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println("JAVA".toLowerCase(Locale.ROOT));
        word = word.toLowerCase();
        System.out.println("word= "+ word);
        *

 */
        String company="Amazon";
        System.out.println(company.toLowerCase());
        System.out.println(company.toUpperCase());
        System.out.println("java".toUpperCase());
        company = company.toUpperCase();
        System.out.println("comapny="+ company);


    }
}

package day21_string_manipulation;


import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word="github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word="+ word);
        System.out.println("word = " + word);
        word=word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i','o'));
        System.out.println(word.replace("i","o").replace('a','i'));



        String sentence="java is fun";
        String withNoSpaces="";
        System.out.println(sentence.replace(""," "));
        System.out.println("withNoSpaces = " + withNoSpaces);
        System.out.println(sentence.replace("java","selenium"));
        System.out.println(sentence.replace("fun","so fun"));


        sentence = sentence.replace("java","selenium").replace("fun", "not fun");

    }
}

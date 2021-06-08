package day19_class_vs_objec_strings;

public class StringStartsWithzEndsWith {
    public static void main(String[] args) {
        String word="intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("java"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("intellij idea"));

    }
}

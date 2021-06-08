package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle=" ";
        System.out.println(jobTitle.isEmpty());

        String word=" ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie="carrots";
        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()){
            System.out.println("we have carrots");

            String word2= "hi";
            System.out.println(word2.isEmpty());
        }

    }
}

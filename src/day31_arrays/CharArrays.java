package day31_arrays;

public class CharArrays {
    public static void main(String[] args) {
        //char array with following values:
        //'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char letter : letters){
            System.out.print(letter+" ");
        }
        //print each letter using a loop
        for(char each : letters) {
            System.out.print(each + " ");
        }

        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        //  0            1         2       3       4         5
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};

        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";

        for(String each : fruits) {
            System.out.print(each +"-");
            fruitStr += each + "-";
        }

        System.out.println("\nfruitStr = " + fruitStr);

        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}





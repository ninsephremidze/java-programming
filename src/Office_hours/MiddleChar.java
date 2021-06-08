package Office_hours;

public class MiddleChar {
    public static void main(String[] args) {
     /*   String word="apple";
        if(word.length()%2==1) {
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }else{
            //even
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2,word.length()/2+1));

            int index=word.length()/2;
            System.out.println(word.substring(index-1,index+1));



      */
           /* String str="java is fun";
            int space=str.indexOf(" ");
            String firstWord=str.substring(0, space);
            System.out.println(str.substring(space+1));
        System.out.println(str.substring(space+1)+" "+firstWord);


            */

        String str = "breadjam";
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread + 5).contains("bread")) {
            } else {
                System.out.println("nothing");
            }
        }
    }
}



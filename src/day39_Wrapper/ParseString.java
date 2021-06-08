package day39_Wrapper;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        int num = Integer.parseInt("55");//can d like this too, but above is more common

        String strPrice = "123.00";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);


        String price2 = "100";
        double price3 = Double.parseDouble(price2);
        if(price>price3){
            System.out.println("true");

            //split by space , parse index index 2 into 2 int
            String sentence="I wrote 100 lines of code";
            String [] str=sentence.split(" ");
            int linesOfCode= Integer.parseInt(str[2]);
            System.out.println("lines of Code "+linesOfCode);

           // String sentence = "I worte 857 lines of code";
            //String[] sentenceSplit = sentence.split(" ");
            //double price2 = Double.parseDouble(sentenceSplit[2]);
            //System.out.println(price2);

            //String sentence = "I wrote 65 lines of codes";
            //String[] sentenceArray = sentence.split(" ");
            //int linesOfCode = Integer.parseInt(sentenceArray[2]);
            //System.out.println("linesOfCode = " + linesOfCode);

        }
        }
        }



package day26_loops;

public class PrintCharts {
    public static void main(String[] args) {
      //  String word="java ";
        //int i=0;
        //for( int i=0;i<word.length();i++);
        //System.out.println(word.charAt(i));


        String word = "java";
        for (int i = word.length()-1; i >= 0; i--){
            System.out.println(word.charAt(i));
        }
    }
}

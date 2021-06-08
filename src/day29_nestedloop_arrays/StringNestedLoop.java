package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word="java";
        for(int i=0; i<word.length();i++){
            for(int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }
    }
}
//to go backwards java ava av a
/*
for(int i = 0; i<word.length(); i++){
        for(int j=word.length()-1;j>=i;j--){
        System.out.print(word.charAt(j));
        }
        System.out.println();
        }
        or do it like this
        for(int i = word.length()-1; i>0; i++ ) {
            for (int j = word.length()-1; j >= i; j--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }



 */
//for(int i=0; i<word.length();i++){
  //  for(int j=i; j<word.length();j++){
    //



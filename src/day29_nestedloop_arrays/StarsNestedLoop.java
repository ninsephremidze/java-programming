package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        //NestedLoop
        for(int i=10; i>0; i--){

            for(int j= 1; j<i; j++){
                System.out.print("************ ");
            }
            System.out.println();
        }
    }
}

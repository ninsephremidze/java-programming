package day29_nestedloop_arrays;

public class NesdedForLoop {
    public static void main(String[] args) {
        for(int minutes=1; minutes<=5; minutes++){
            System.out.println("\nminutes="+minutes);
            for(int seconds=1;seconds<=60;seconds++){
                System.out.print(seconds+" ");
            }
        }
    }
}

package day24_loops;

public class WhileLoops {
    public static void main(String[] args) throws InterruptedException {
        int apple = 1;
        while (apple <= 10) {
            System.out.println("eating an apple- " + apple);
            ++apple;
        }
        System.out.println("no more apples");


        //video is 1 min 57 seconds
        int seconds = 0;

        while(seconds<=117){
            System.out.println("Playing cat");
            seconds++;
            Thread.sleep(1000);

        }
        System.out.println("Cat stop playing");
    }






        }






package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number=55;
        if(number%3==0 && number%5==0){
            int num = 13;

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");

            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            }else {}

            String fizzBuzz = (num % 3 == 0 && num % 3 == 0)? "FizzBuzz" : num % 5 == 0 ? "Fizz"
                    : num % 5 == 0 ? "Buzz" : "invalid";
            System.out.println(fizzBuzz);

        }
    }
}

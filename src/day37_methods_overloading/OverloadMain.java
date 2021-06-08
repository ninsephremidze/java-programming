package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        addNumbers(5, 6, 7, 8, 10, 20);

    }
    public static void addNumbers (int ... nums){

        int sumOf = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOf += nums[i];

        }
        System.out.println(sumOf);
    }
}
package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String [] student1 = new String [5];
        student1 [0] = "AB06042021";
        student1 [1] = "Elvin";
        student1 [2] = "Ismaylov";
        student1 [3] = "Batch 22";
        student1 [4] = "5714663443";

        System.out.println("Student ID: " + student1[0]);
        System.out.println("Student Name: " + student1[1]);
        System.out.println("Student Last Name: " + student1[2]);
        System.out.println("Student Batch Number: " + student1[3]);
        System.out.println("Student Phone Number: " + student1[4]);
        if (student1.length == 5) {
            System.out.println("student 1 data array has correct length");
        } else {
            System.out.println("student 1 data array has incorrect length");
        }
        System.out.print(student1[1].toUpperCase()+ " " +student1[2].toUpperCase());

    }
}

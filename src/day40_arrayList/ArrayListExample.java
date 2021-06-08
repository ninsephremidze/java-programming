package day40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer>nums =new ArrayList<>();// polymorphic way
        System.out.println(nums);
        System.out.println("size="+nums.size());
        nums.add(34);nums.add(44);nums.add(3);nums.add(88);
        nums.add(500);nums.add(5);nums.add(845);nums.add(0);
        System.out.println("nums="+nums);
        nums.remove(0);
        System.out.println("nums="+nums);
        nums.remove(new Integer(88));// 88 is gone now
        System.out.println("nums="+nums);
        nums.remove(new Integer(5));
        System.out.println("nums"+nums);

        //lets loop it now- iterate through all values and print

        for(int i=0;i<nums.size();i++);
        System.out.println(nums.get(0));

        //for each loop. and print all in the same line
        for(Integer each:nums){
            System.out.println(each+" ");

        }


    }
}

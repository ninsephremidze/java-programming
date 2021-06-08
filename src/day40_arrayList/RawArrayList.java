package day40_arrayList;

import java.util.ArrayList;
public class RawArrayList {
    public static void main(String[] args) {
      ArrayList<Integer>nums=new ArrayList<>();
      nums.add(5);
      nums.add(7);
      nums.add(11);
      //nums.add("java); error
        // nums.add("java"); error, because it's a specific array
        System.out.println("size="+nums.size());
        System.out.println("index 0=");

        //reading from arraylist
        System.out.println("index of 0="+nums.get(0));
        System.out.println("index of 0="+nums.get(1));
        System.out.println("index of 0="+nums.get(2));
        System.out.println("Last index = " + nums.get(nums.size() -1));

        //print all values in same line
        System.out.println(nums);//Arrays.toString(numArray)
        nums.remove(1);//remove element at index 1

        System.out.println(nums);
    }
}

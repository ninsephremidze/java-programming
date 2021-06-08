package day41_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(23,1,34,55);
        System.out.println("nums="+ nums);
        List<Integer>numsList=new ArrayList<>(Arrays.asList(2,4,5,65,12223));
        numsList.add(55);
        numsList.add(33);
        System.out.println("nums"+ numsList);
        numsList.remove(new Integer(4));
        System.out.println("numslist"+numsList);

        int coffeineAmount = 0;
        List<String> drinksWithCoffe = new ArrayList<>(Arrays.asList("coffee", "tea", "celsius",  "monster", "red bull", "coke", "pepsi", "kambucha", "mdew"));

        for(String each : drinksWithCoffe){

            if(each.equals("monster") || each.equals("red bull") || each.equals("celsius")){
                coffeineAmount=150;
            }else if(each.equals("coffee") || each.equals("kabucha")){
                coffeineAmount = 112;
            }else if(each.equals("tea") || each.equals("coke") || each.equals("pepsi") || each.equals("mdew")){
                coffeineAmount = 35;
            }

        }
    }
}

package day41_Arraylist;

import java.util.ArrayList;

public class ArrayListExercise1 {
    public static void main(String[] args) {
//declare arraylist
        ArrayList<String> cities=new ArrayList<>();
        cities.add("DC");//o
        cities.add("NY");//1
        cities.add("Salt Lake City");//2
        cities.add("Sydney");//3
        cities.add(0,"Ashkabad");
        System.out.println(cities);
        //print first and last city, we use get method
        System.out.println("first city=  "+cities.get(0));
        System.out.println("last city= "+cities.get(4));
        System.out.println("last city="+cities.get(cities.size()-1));//another way to type last city
        //we do size instead of length in arraylist
        //we use get in array list- get means give me
        //add value adds to last position
        // add( index, value)= adds to index position
        //when we add values to array list it remembers the index numbers
        //print count of items in arraylist. we use size

        System.out.println("count of items="+cities.size());


        for(String each : cities){
            System.out.print(each+ " ");
        }

        for (String city: cities){
            System.out.println(city + " ");
        }

//print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " + size +" cities in the list");

        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for(String city : cities) {
            System.out.print(city +" ");
        }

        //delete item from arraylist
cities.remove(3);
        cities.remove("NY");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);
        //make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }
    }
}




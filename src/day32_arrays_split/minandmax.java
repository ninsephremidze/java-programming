package day32_arrays_split;
import java.util.*;
public class minandmax {
    public static void main(String[] args) {
        // find the most expensive and least expensive item
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        double expensive = prices[0];
        double cheap = prices[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        for(int i=0; i< items.length; i++){
            if(prices[i]>expensive){
                expensive=prices[i];
                indexOfMax = i;
            }
            if(prices[i]<cheap){
                cheap=prices[i];
                indexOfMin = i;
                System.out.println(Arrays.toString(items));
            }
        }
        System.out.println(items[indexOfMax]+ " - $" +prices[indexOfMax] +" - #"+ itemIDs[indexOfMax]);
        System.out.println(items[indexOfMin]+ " - $" +prices[indexOfMin] +" - #"+ itemIDs[indexOfMin]);


        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println(Arrays.toString(prices));
        double maxPrice=prices[0];
        int indexOfMaxPrice=0;

        for(int i=0;i<prices.length;i++){
            System.out.println(prices[i]);
            if (prices[i]>maxPrice){
                maxPrice=prices[i];
                System.out.println("maxprices   "+ maxPrice);

            }

        }
    }
}

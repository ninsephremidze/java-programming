package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items array -----");
        //use for loop with condition
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break; //exit for loop
                //System.out.println(i + " - " + items[i]);
            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;
            }
        }
        boolean iPasExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPasExists = true;
                break;


                /*for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                    System.out.println(prices[i]);
                    System.out.println(itemIDs[i]);
                    System.out.println("<><><><><><><><><><>");

                 */

                //for (int i = 0; i < items.length; i++) {
                  //  if (items[i].equalsIgnoreCase("JACKET")) {
                     //   System.out.println("Finally found my fave: " + items[i] + " for $" + prices[i]);
                       // break;

                    }
                }
            }
        }






package day40_arrayList;
import day08_casting_scanner.ShoppingBalanceCalculator;

import java.util.*;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size=" + shoppingList.size());
        System.out.println("is empty?=" + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("list isnt empty");
        }
        {
        }
        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("Scooter");
        shoppingList.add("java book");
        shoppingList.add("scooter");
        shoppingList.add("sunglasses");
        if (shoppingList.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("list isnt empty");
        }
        {
        }
        int count = shoppingList.size();
        System.out.println("items to buy=" + count);

        System.out.println("are shoes in my list" + shoppingList.contains("shoes"));


        if (shoppingList.contains("shoes")) {
            System.out.println("you got shoes");
        } else {
            System.out.println("go back to mall and get shoes");
        }
        shoppingList.remove(new String("cheap monitor"));
        System.out.println(shoppingList);
        shoppingList.remove("shoes");
        System.out.println("list"+shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();
        System.out.println("shoppingList = " + shoppingList);
    }
}



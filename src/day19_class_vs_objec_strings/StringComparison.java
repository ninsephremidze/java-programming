package day19_class_vs_objec_strings;
public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));

        System.out.println(city.equalsIgnoreCase("Chiicago"));
        if (city.equals("chicago")) {
            System.out.println("equals()true");
        } else {
            System.out.println("equals() false");
            if (city.equalsIgnoreCase("CHICAGO")) {
                System.out.println("equalsIgnoreCase() true");
            } else {
                System.out.println("equalsIgnoreCase() false");
            }
        }
    }

}

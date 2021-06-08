package day19_class_vs_objec_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}



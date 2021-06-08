package day34_customfunctions;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
    }
    public static void openBrowser() {
        System.out.println("launching Chrome Browser");
    }


    public static void navigateToEtsyUrl() {
        System.out.println("go to Etsy.com");
    }

    public static void searchForWoodenSpoon(){
        System.out.println("search for wooden spoon");
    }
}


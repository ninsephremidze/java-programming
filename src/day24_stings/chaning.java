package day24_stings;

public class chaning {
    public static void main(String[] args) {
        String word = " woo den sp oon ";

        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());

        // selenium.findElement(By.id("hi")).click();

        String city = "kAbUl";
        //read 1st letter.makeUcase     +  read 2nd till last.make lowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

       // int a=5;
       // byte b=a;
       // System.out.println(b);

        int num=-5;
        System.out.println(num++ +",");
        System.out.println(num=0);
        System.out.println(","+--num);

        boolean one=('a'!='z')&&false;
        boolean two=one ||0==(9-10+10);
        System.out.println(two);

        short s=13-9/3*10;
        s+=-10;
        System.out.println(s);


    }
}




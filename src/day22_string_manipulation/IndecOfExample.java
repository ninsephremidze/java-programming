package day22_string_manipulation;

public class IndecOfExample {
    public static void main(String[] args) {
        String technologies="java,html,css,selenium, testing, maven,cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));



        int idxOfCss=technologies.indexOf("css");
        System.out.println("css"+idxOfCss);


        int indexOfCucumber=technologies.indexOf("cucumber");
        System.out.println("cucumber"+indexOfCucumber);

        int indexOFsql=technologies.indexOf("sql");
        System.out.println("sql"+indexOFsql);
    }
}

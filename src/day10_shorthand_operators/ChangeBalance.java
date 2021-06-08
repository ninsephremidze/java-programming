package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeBalance {
    public static void main(String[] args) {
       double declareBalance=1230.55;
        System.out.println("declaredBalance="+declareBalance);
        double baklava=22.50;
        System.out.println("baklava = " + baklava);
        declareBalance=declareBalance-baklava;
        System.out.println("baklava = " + declareBalance);
        double kenafa=44.45;
        System.out.println("kenafa = " + kenafa);
        double plov=7.99;
        System.out.println("plov = " + plov);
        declareBalance=declareBalance-plov;
        System.out.println("balance after plov=" +plov);
        double icedTea=3.0;
        System.out.println("icedTea="+ icedTea);
        declareBalance=declareBalance-icedTea*4;
        System.out.println("balance after 4iced teas = " + declareBalance);









   



    }
}

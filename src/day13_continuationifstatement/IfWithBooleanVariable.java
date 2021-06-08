package day13_continuationifstatement;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry=true;
        if(isHungry==true){
            System.out.println("milk duds");}
        else{
            System.out.println("karrakisa");
        }
        double price=130.44;
        boolean isaffordable=price<=200;
        System.out.println("isaffordable = " + isaffordable);
        if(isaffordable) {
        }else {
                System.out.println("too expensive");
        }
      boolean isRemotejob=true;
        if(isRemotejob!=true){
            System.out.println("im not interested");}
        else{
            System.out.println("im interested");
        }

    }
}

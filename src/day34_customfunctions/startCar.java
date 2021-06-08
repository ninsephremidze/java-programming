package day34_customfunctions;

public class startCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        PressGasPedal();


    }
    public static void seatInCar(){
        System.out.println("Seat");

    }
    public static void startTheCar(){
        System.out.println("start the car");
    }
    public static void shiftToDrive(){
        System.out.println("change shift to drive");
    }
    public static void PressGasPedal(){
        System.out.println("press gas to start moving");
    }
}
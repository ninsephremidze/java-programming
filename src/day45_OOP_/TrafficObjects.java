package day45_OOP_;

public class TrafficObjects {
    //create traffic light object
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; NOT THIS WAY today
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        ///System.out.println("current color = " + trafficLight.color); DIRECT access to variable. Not recommended
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();
    }
}




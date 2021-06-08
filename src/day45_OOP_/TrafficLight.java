package day45_OOP_;



//traffic light : we want to describe colors and lights changing
public class TrafficLight {
   String color;
   //read only method
   public void showColor() {
       System.out.println("current color=" + color);
   }
   public void changeColor(String newColor){
       System.out.println("changing color"+ newColor);
       color=newColor;



       }
    }



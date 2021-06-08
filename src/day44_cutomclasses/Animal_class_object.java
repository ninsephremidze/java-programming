package day44_cutomclasses;

public class Animal_class_object {
    public static void main(String[] args) {
        Animal animal= new Animal();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak();
        Animal cheetahObj=new Animal();
        cheetahObj.type="cheetah";
        System.out.println(cheetahObj.type);
cheetahObj.eat("meat");

    }
}

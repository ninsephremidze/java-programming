package day24_stings;
//substring and index of together used

public class Stringpractice {
    public static void main(String[] args) {

//
      //  String message = "Sender: [Nadir] From Number<2223334444>";
        //System.out.println("Hello, lets code some java");
        //System.out.println(message.substring(message.indexOf("[") +1, message.indexOf("]")));

        String message = "Sender: [Saim] From Number <2223334444> Message: {Hello, lets code some java}";
        int start=message.indexOf("[");
        int end=message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        String sender=message.substring(start+1,end);
        System.out.println("sender = " + sender);

        String mobile=message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobil="+  mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        if(sender.equals("   Saim")) {
        }else{
            System.out.println("someone else text me");

        }




    }
}


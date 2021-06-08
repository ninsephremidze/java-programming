package day24_stings;

public class MoreLoops {
    public static void main(String[] args) {

        int UnreadSms = 10;

        System.out.println("I have total"+UnreadSms+"unread sms");
        while(UnreadSms>=0){
            System.out.println("reading SMS"+UnreadSms);
            --UnreadSms;
        }
    }
}

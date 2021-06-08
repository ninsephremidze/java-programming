package day24_stings;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secretPinCode=1234;
        int PinCode;
        do {
            System.out.println("Enter pin code");
            PinCode = scan.nextInt();
        } while(PinCode!=secretPinCode);

        }
    }
//rns until the condition becomes true and we put pincode 1234

package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words2 = "java is fun";
        String [] words2Array = words2.split(" ");
        System.out.println(Arrays.toString(words2Array));
        System.out.println("Length of Array =  "+words2Array.length);

        String words3 = "bengal cat tabby cat persian cat no cat here";
        String [] words3Array = words3.split(" cat ");
        System.out.println(Arrays.toString(words3Array));
        System.out.println("Length of Array =  "+words3Array.length);



    }
}

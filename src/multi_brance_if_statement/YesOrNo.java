package multi_brance_if_statement;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure yuou want to delete this file?");
       char selection='y';
       boolean answer;
       if(selection=='y'){
           System.out.println("your file will be deleted");}
           else{
           System.out.println("file deletion cancelled");
       }

    }
}

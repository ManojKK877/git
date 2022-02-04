//.Program to Find ASCII Value of a Characte
import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
         System.out.println("enter the Character value :");
         char name= scan.next().charAt(0);
         int CHAR =name;
         System.out.println("the ASCII value is" +CHAR);
    
    }
    
}

// Write program to print number from 1-10.
import java.util.Scanner;
public class datatype {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the n value :");
        byte n= scan.nextByte();
      for(byte i=1;i<=n;i++)
      {
          System.out.println(i);
      }
    }
}

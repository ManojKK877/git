import java.util.Scanner;
 public class NumberofDigits {
    
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the value:");
        int types=scan.nextInt();
        int count=0;
        while(types>0)
        {
              types=types/10;
              count++;
        }
        System.out.println(" The  Number of  Count Digits is :"+count);

    }
}

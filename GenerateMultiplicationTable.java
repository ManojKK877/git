import java.util.Scanner;
public class GenerateMultiplicationTable {
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter the n value in Multiplication :");
            int input= scan.nextInt();
         System.out.println("enter the limitation :" );
             int n= scan.nextInt();
         for(int i=1;i<=n;i++)
         {
             System.out.println("the Multiplication value : "+i+"*"+input+"="+input*i);
         }
     }
}

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args)
    {   
    
         Recursion object =new Recursion();
         Scanner scan =new Scanner(System.in); 
         System.out.println("enter the number :");
         int num=scan.nextInt();
        
         object.display(num);
         
    }
      void display(int num )
      {           
        int remainder,reverse=0;
             remainder=num%10;
              reverse=reverse*10+remainder;
             num=num/10;
             display(num);
              System.out.println("ReverseNumber:" +reverse);
            }
 
}

import java.util.Scanner;

public class PalindromeString {
   public static void main(String[] args) 
   { 
       Scanner scan =new Scanner(System.in);
       System.out.println("Enter the Name  ");
        String value =scan.next();
        //String Buffer Method used
       StringBuffer Names=new StringBuffer(value);
       Names.reverse();
       //if Condition 
       if(value.contentEquals(Names))
       {
           System.out.println("This  is Palindrome ");
       }
        
     else 
        {
        System.out.println("This is Not  Palindrome ");
       }
       
       

      

   }
}

  
  import java.util.Scanner;
 public class PositiveNegative {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the number Positive or Negative : ");
          int n=scan.nextInt();
        String types =n>0? "postiveNumber":"NegativeNumber";
           System.out.println(types);
    }
    
}

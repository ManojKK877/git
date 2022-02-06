 import java.util.Scanner;
 public class FibonacciSequence {
    public static void main(String[] args){
    Scanner scan =new Scanner(System.in);
          System.out.println("enter the n value :");
          int a=-1,b=1,c;
          int n=scan.nextInt();
          for(int i=0;i<=n;i++)
          {
          c=a+b;
          a=b;
          b=c;
        
          System.out.println("The FibonacciSequence value :"+c);
          }
      }
      
}

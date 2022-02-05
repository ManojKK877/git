 // Write a program to evaluate the polynomial equation
 import java.util.Scanner;
public class polynomial {
    public static void main(String[] args)
   {
       Scanner scan=new Scanner(System.in);
       double a,b,c,disc,r1,r2;
       System.out.println("enter the value a : ");
       a=scan.nextDouble();
       System.out.println("enter the value b : ");
       b=scan.nextDouble();
       System.out.println("enter the value c : ");
       c=scan.nextDouble();
       // polynomial equation
       disc=(b*b-4*a*c);
       r1=(-b-Math.sqrt(disc))/2*a;
       r2= (-b+Math.sqrt(disc))/2*a;
       System.out.println(r1);
       System.out.println(r2);
      /*double polynomial;// =a*x* + b*x + c;
      double x=r1*r2;
      polynomial=a*x+b*x+c;
      System.out.println(polynomial);
      scan.close();*/
   }
}

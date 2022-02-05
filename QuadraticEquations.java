 
 import java.util.Scanner;
public class QuadraticEquations {
    public static void main(String[] arags)
    {
        Scanner scan=new Scanner(System.in);
        double a,b,c,disc,r1,r2;
        System.out.println("enter the value a : ");
        a=scan.nextDouble();
        System.out.println("enter the value b : ");
        b=scan.nextDouble();
        System.out.println("enter the value c : ");
        c=scan.nextDouble();
        disc=(b*b-4*a*c);

        r1=(-b-Math.sqrt(disc))/2*a;
        r2=(-b+Math.sqrt(disc))/2*a;

        System.out.println(r1);
        System.out.println(r2);
    }
    
}

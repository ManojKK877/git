
import java.util.Scanner;
public class Swapnumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.println("Enetr the a value :");
        a=scan.nextInt();
        System.out.println("Enetr the b value :");
        b=scan.nextInt();
        System.out.println("this method is  Swaping :");
         int c;
         c=a;
        a=b;
        b=c;
        System.out.println("After   Swaping :"+a);
        System.out.println("After  Swaping :"+b);

       }

    }

    


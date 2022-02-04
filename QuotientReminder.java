//Program to Compute Quotient and Remainder
import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int d1,d2,q,r;
        System.out.println("enter the dividend: ");
        d1=scan.nextInt();
        System.out.println("enter the divisor: ");
        d2=scan.nextInt();
        q=d1/d2;
        r=d1%d2;
        System.out.println("the quotient value :"+q);
        System.out.println("the quotient value :"+r);
        

    }
    
}

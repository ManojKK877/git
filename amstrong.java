 import java.util.Scanner;
 public class amstrong {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=scan.nextInt();
        int reverse=0,sum,temp=0;
        temp=number;
        while(number>0)
        {
             sum=number%10;
             reverse=reverse+sum*sum*sum;
             number=number/10;

        }
        if(temp==reverse)
        System.out.println("  This is Amstrong");
        else
        System.out.println("  This is  not Amstrong");

    }
}

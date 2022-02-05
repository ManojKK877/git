import java.util.Scanner;
public class palindrome {
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
             reverse=reverse*10+sum;
             number=number/10;

        }
        if(temp==reverse)
        System.out.println("  This is plaindrome");
        else
        System.out.println("  This is  not plaindrome");

    }
    }
    




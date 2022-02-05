 
 import java.util.Scanner;
 public class ReverseNumber {

    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=scan.nextInt();
        int reverse=0,sum;
        while(number>0)
        {
             sum=number%10;
             reverse=reverse*10+sum;
             number=number/10;

        }
        System.out.println("  The Reverse Number is :"+reverse);

    }
    
}

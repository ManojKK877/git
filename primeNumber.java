 
 import java.util.Scanner;
public class primeNumber {



    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=scan.nextInt();
        int rem,count=0;
        for(int i=2;i<number;i++)
        {
           rem=number%i;
           if(rem==0)
           count++;
        }
        if(count==0)
        System.out.println("this is prime number");
        else
        System.out.println("this is not a prime number");

    }
}
 

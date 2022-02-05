import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args)
    {
        
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the n value :");
        int n= scan.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("the FactorialNumber is : " +fact);
    }
}

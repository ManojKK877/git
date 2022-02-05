import java.util.Scanner;
public class naturalNumber  {
    public static void main(String[]args)
{
   

        Scanner scan =new Scanner(System.in);
        System.out.println("enter the n value :");
        int n= scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the natural is : "+sum);
    }
    
}


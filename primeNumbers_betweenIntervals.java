import java.util.Scanner;
public class primeNumbers_betweenIntervals {
    public static void main(String[] args){
    Scanner scan =new Scanner(System.in);
       
        int i,j;
        System.out.println("enter the startvalue  number: ");
        int  startvalue=scan.nextInt();
        System.out.println("enter the endvalue number: ");
        int  endvalue=scan.nextInt();

        for( i=startvalue;i<=endvalue;i++)
        {
        for( j=2;j<=i;j++)
        {
          if(i%j==0)
          break;
        }
           if(i==j)
           System.out.println("this is prime number"+i);
        }
    }
    }


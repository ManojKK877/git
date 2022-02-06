import java.util.Scanner;
 public class armstrongNumbertwoIntervals {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number: ");
       
        //int number=scan.nextInt();
        int a=scan.nextInt();
          int b=scan.nextInt();
        //temp=number;
        int number;
        
        int remaind;
        for(int i=a;i<=b;i++)
        {
            number=i;
            int reverse=0;
        while(number > 0)
        {
             remaind=number%10;
             reverse=reverse+(remaind*remaind*remaind);
             number=number/10;

        }
        if( reverse==i)
        System.out.println(reverse);
    }
        /*else
        System.out.println("  This is  not Amstrong");*/
    

    }
}



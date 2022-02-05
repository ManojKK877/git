//find the leap year
import java.util.Scanner;
public class leapYear {
    public  static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the leap year: ");
        int year = scan.nextInt();
        if(year%4==0 && year%200==0 && year%400==0)
       {
           System.out.println("this is leap year :"+year);
       }
         else
            System.out.println("this is  Not leap year :"+year);
    }
    

    
}

//.Program to Check Whether a Number is Even or Od
import java.util.Scanner;

public class AddEven {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);       
        System.out.println("enter the n value :");
        int n=scan.nextInt();
        String values = n%2!=0?"ADDnumber":"EvenNumber";
        System.out.println("this is number is :" +values);
        scan.close();
    }
    
}

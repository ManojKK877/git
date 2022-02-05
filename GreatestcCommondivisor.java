import java.util.Scanner;
 public class GreatestcCommondivisor {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
                 System.out.println("enter the two value :");
        int inputValur_1=scan.nextInt();
        int inputValur_2=scan.nextInt();
        //ternary Operator
                int minimum=inputValur_1 < inputValur_2 ? inputValur_1:inputValur_2;
        while(minimum>=2)
        {
        if((inputValur_1%minimum==0) && (inputValur_2%minimum==0))
                System.out.println("The Greatest Common divisor :"+minimum);

        minimum--;
        }
    }
}

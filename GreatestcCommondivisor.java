import java.util.Scanner;
 public class GreatestcCommondivisor {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
                 System.out.println("enter the two value :");
        int inputValur_1=scan.nextInt();
        int inputValur_2=scan.nextInt();
        //ternary Operator
                int inputValur_3=inputValur_1 < inputValur_2 ? inputValur_1:inputValur_2;
        while(inputValur_3>=2)
        {
        if((inputValur_1%inputValur_3==0) && (inputValur_2%inputValur_3==0))
                System.out.println("The Greatest Common divisor :"+inputValur_3);

        inputValur_3--;
        }
    }
}

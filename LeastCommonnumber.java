import java.util.Scanner;
public class LeastCommonnumber {
    
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
                 System.out.println("enter the two value :");
                 
        int inputValur_1=scan.nextInt();
        int inputValur_2=scan.nextInt();
        
        //ternary Operator
                int maximum=inputValur_1 > inputValur_2 ? inputValur_1:inputValur_2;
        while(true)
        {
        if((maximum%inputValur_1==0) && (maximum%inputValur_2==0))
        {
             
               System.out.println("The Least Common divisor :"+maximum);
               break;
        }
    
               maximum++; 
               
        }
        
}
}

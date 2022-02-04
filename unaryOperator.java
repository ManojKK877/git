 //) Write a program with Unary operators
 import java.util.Scanner;
 public class unaryOperator {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
         int a,b;
         System.out.print("enter the value a:");
         a=scan.nextInt();
        b=a++ + ++a;
        System.out.println(b);
        System.out.println(a);



         


    }
    
}

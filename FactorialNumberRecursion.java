import java.util.Scanner;
public class FactorialNumberRecursion {
    public static void main(String[] args) {
        System.out.println("the enter number :");
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num < 1)
            return 1;
            else
            return num + multiplyNumbers(num - 1);
    }
}


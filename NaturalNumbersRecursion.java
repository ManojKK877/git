 import java.util.Scanner;
 public class NaturalNumbersRecursion { 
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number value :");
        int number = scan.nextInt();
        int sum = NaturalNumbersRecursion(number);
        System.out.println("Sum = " + sum);
    }

    public static int NaturalNumbersRecursion(int num) {
        if (num != 0)
            return num + NaturalNumbersRecursion(num - 1);
        else
            return num;
    }
}
    


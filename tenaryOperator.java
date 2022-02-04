//Write a program with Ternary Operator
import java.util.Scanner;
public class tenaryOperator {
    public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the n value :");
    int n;
    n=scan.nextInt();
    String type =(n%2!=0)? "AddNumber" : "EvenNumber";
    System.out.println(type);
  }
    
}

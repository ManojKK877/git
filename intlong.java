// Write a progrm to check if the following numbers are the same or different 
//input 6,6l
 import java.util.Scanner;
 public class intlong {

    public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    // datatype is used interger and long
    //input 
    int input;
            System.out.println("Enter the input Value Integer :");
            input=scan.nextInt();
    long input1;
            System.out.println("Enter the input1 Value Long :");
            input1=scan.nextLong();
//if condition process
    if(input==input1)
            System.out.println("The value is same ");
    else
            System.out.println("The value is different");
    scan.close();
}
}

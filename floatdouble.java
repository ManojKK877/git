//Write a program to check the following numbers are the same or different?
//input 6.02f and  6.02d
     import java.util.Scanner;
     public class floatdouble {
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    // datatype is used float and double
    //input 
    float input;
            System.out.println("Enter the input Value FLOAT :");
            input=scan.nextFloat();
    float input1;
            System.out.println("Enter the input1 Value DOUBLE :");
            input1=scan.nextFloat();
//if condition process
    if(input==input1)
            System.out.println("The value is SAME ");
    else
            System.out.println("The value is NOT SAME");
    scan.close();
}
}

    


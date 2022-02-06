
  import java.lang.Math;
 import java.util.Scanner;
 public class BinaryNumberConvertDecimalNumber {
    public static void main(String[] args)
 {    
     Scanner scan =new Scanner(System.in);
       int remainder,sum=0,number,p=0;
       System.out.println("enter the Binary Number :");
       number=scan.nextInt();
     while(number>0)
     {
          remainder=number%10;
          sum=sum+(int)(remainder*Math.pow(2,p));
          number=number/10;
          p++;

     }
     System.out.println("the  Binary Number Convert to Decimal Number:"+sum);

 }
}

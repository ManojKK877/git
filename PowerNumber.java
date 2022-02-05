import java.util.Scanner;
public class PowerNumber {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        System.out.println("enter the base: ");
        int base=scan.nextInt();
        System.out.println("enter the expansion: ");
        int expansion=scan.nextInt();
        int result=1;
        for(int i=0;i<expansion;i++)
        {
            result=result*base;
        }
        System.out.println("the Power of a Number:"+result);

}
}

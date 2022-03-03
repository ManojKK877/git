 import java.util.Scanner;
 public class SwitchCase1 {
    public static void main(String[] args)
    {

        Scanner scan =new Scanner(System.in);
            System.out.println("Select your choices : ");
        System.out.println(" 1.Addition\n 2.Subractions\n 3.Mutliplication\n 4.Divison");
            
            int choice=scan.nextInt();
        System.out.println("enter the two values :");
             int a=scan.nextInt();
            int b=scan.nextInt();
            String choice1=scan.next();
            //System.out.println("Select your choices : ");
           
           
            // integer value used
        switch(choice)
        {
            case 1: 
                System.out.println(a+b);
                break;
               
            case 2:    
    switch(choice1)
        {
            case "Addition" :
                System.out.println(a+b);
                break;
                default:
                System.out.println("check number");
                break;
            case "Subractions":
                System.out.println(a/b);
                break;
            case "Mutliplication":
                System.out.println(a%b);
                break;
            case "Divison":
                System.out.println(a*b);
                break;
              
        }
            case 3:
                System.out.println(a%b);
                break;
            case 4:
                System.out.println(a*b);
                break;

        }
       /* switch(choice)
        {
            case "Addition" :
                System.out.println(a+b);
                break;
            case "Subractions":
                System.out.println(a/b);
                break;
            case "Mutliplication":
                System.out.println(a%b);
                break;
            case "Divison":
                System.out.println(a*b);
                break;

        }*/
       /* switch(choice)
        {
            case Addition": 
                System.out.println(a+b);
                break;
            case "Subractions":
                System.out.println(a/b);
                break;
            case "Mutliplication":
                System.out.println(a%b);
                break;
            case "Divison":
                System.out.println(a*b);
                break;

        }*/

    }
    
}

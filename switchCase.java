import java.util.Scanner;
 public class switchCase {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
            System.out.println("Select your choices : ");
        System.out.println(" 1.Addition\n 2.Subractions\n 3.Mutliplication\n 4.Divison");
            int choice=scan.nextInt();
        System.out.println("enter the two values :");
             int a=scan.nextInt();
            int b=scan.nextInt(),c;
        switch(choice)
        {
            case 1 :c=a+b;
            System.out.println("the Addition value : "+a +"+"+b+"="+c);
            break;
            /*case 2:c=a-b;
            System.out.println("the Subractions value : "+a +"-"+b+"="+c);
            break;*/
            case 3:c=a*b;
            System.out.println("the Mutliplication value :"+a +"*"+b+"=" +c);
            break;
            case 4:c=a/b;
            System.out.println("the Divison value: "+a +"/"+b+"="+c);
            break;
        }


    }
}

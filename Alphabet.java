import java.util.Scanner;

public class Alphabet {
    
    public static void main(String[] main)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enetr the Character:");
        String values=scan.nextLine();
        for(int i=0;i<values.length();i++)
               
            {     char value= values.charAt(i);
                if(value>=65 &&value<=90||value>=97 &&value<=122)
                {
                    System.out.print("this is alphabet :"+value);
                }
                else
                System.out.print("this is  not a aphabet :"+value);
            }
            scan.close();


    }
}

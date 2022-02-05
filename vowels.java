import java.util.Scanner;

public class vowels {
     
    public static void main(String[] args)
    {
         Scanner scan=new Scanner(System.in);
         System.out.println("writer a name :");
         String name= scan.next();
         for(int i=0;i<name.length();i++)
         {
             char names=name.charAt(i);
             if(names=='a'||names=='u'||names=='e'||names=='i'||names=='o')
             System.out.println("the vowels is :" +names);
         }
       
    }
}

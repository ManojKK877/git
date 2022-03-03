 import java.util.Scanner;
 public class AlphabetsCount {
    
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        //
        int  countofa=0,countofb=0,countofc=0,countofd=0,countofe=0;
            
           String  value ="aaabbbbccad";
         for(int i=0;i<value.length();i++)
         {
             
            char values=value.charAt(i);

             switch(values)
           {
              case 'a':
              countofa++;
              break;
              case 'b':
              countofb++;
              break;
              case 'c':
              countofc++;
              break;
              case 'd':
              countofd++;
              break;
              case 'e':
              countofe++;
              break;
             }
            }
            System.out.println("a"+countofa);
            System.out.println("b"+countofb);
            System.out.println("c"+countofc);
            System.out.println("d"+countofd);
            System.out.println("e"+countofe);
            
    }
}

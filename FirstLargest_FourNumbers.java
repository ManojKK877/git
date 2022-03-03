 import java.util.Scanner;
 public class FirstLargest_FourNumbers {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        
        int secondmax=0;
        int thirdmax=0;
        int fourthmax=0;
        System.out.println("Enter the Array Limitations : ");
          int size=scan.nextInt();
          int [] mark=new int[size];
        System.out.println("Enter the Array Value: ");
         for(int i=0;i<mark.length;i++)
              {
             mark[i]=scan.nextInt();
              }
         int max=0;
            for(int i=0;i<mark.length;i++)
              {
             if(mark[i]>max)
              {
             max=mark[i];
              }
         
             else if(mark[i]>secondmax)
              {
             secondmax=mark[i];
              }
             else if(mark[i]>thirdmax)
              {
             thirdmax=mark[i];
              }
              else if(mark[i]>fourthmax)
              {
             fourthmax=mark[i];
              }
      }
      System.out.println("----------------------------");
         System.out.println("First largest Number :"+max);
          System.out.println("Second largest Number :"+secondmax);
          System.out.println("Third largest Number :"+thirdmax);
          System.out.println("Fourth largest Number :"+fourthmax);
  


}
    

    }
    


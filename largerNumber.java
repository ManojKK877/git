  
  import java.util.Scanner;
  public class largerNumber {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the n value : ");
        int type,n=scan.nextInt();
        int[] tamil = new  int[5];
        System.out.println("enter the number :");
        for(int i=0;i<n;i++)
        {
               tamil[i]=scan.nextInt();
        }
        type =tamil[0];
        for(int i=0;i<n;i++)
       {
         if(tamil[i]>type)
         type=tamil[i];
       }
        System.out.println("the larger Number is :"+type);

         


    }
    
}

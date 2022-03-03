import java.util.Scanner;

public class ExpectionHandling {
    public  static void helo()
    {
        Scanner scan =new Scanner(System.in);
        try{
   System.out.println(" enter the aValue :"); 
   int a=scan.nextInt();
   System.out.println(" enter the b Value :");
   int b=scan.nextInt(); 
   System.out.println("enter the array length :");
   int len =scan.nextInt();
   int [] array=new int[len];
   {
       for(int i=0;i<5;i++)
       {
           array[i]=scan.nextInt();
       }
   }
   

   }
   

  
   
    catch(ArrayIndexOutOfBoundsException e)
    {
       System.out.println("Chick the number");
    }
   catch(Exception e){
     System.out.println("Chick a numbers");
   }
    
   finally{
    System.out.println(" hi am back in the program");
    
   }
}
  
    public static void main(String[] args)
    {
         helo();
    }
   


}

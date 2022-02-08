 import java.util.Scanner;
 public class program {
    
        public static void main(String[] args)
        {
                
            Scanner scan =new Scanner(System.in);
            int[] array=new int[5];
        int i;
        for(i=0;i<array.length;i++)
        {
                array[i]=scan.nextInt();
        }
        int temp=array[0];
        for(i=0;i<array.length-1;i++)
        { 
               array[i]=array[i+1];
        }
        array[i]=temp;
        for(i=0;i<array.length;i++)
              System.out.print(array[i]);
        
          


            int n=6;
            while(n>0)
            {
            System.out.println("hi");
            n--;      
            }               
                     


          
        }
    
    


      }



  import java.util.Scanner;
  public class AscendingDescendingorder{
    public static void main(String[] args)
    {
         // user input 
          Scanner scan =new Scanner(System.in);
         // array primitive data type used
         // n is limitations of array
         int temp=0;
         System.out.println("Enter the Array Limitations : ");
          int input = scan.nextInt();
        System.out.println("Enter the number upto Limitations :");
          int[] array = new int[input];
          //input value store in array
             for(int i=0;i<array.length;i++)
              {
                array[i]=scan.nextInt();
              }
              for(int i=0;i<array.length;i++)
              {
                for(int j=0+i;j<array.length;j++)
                 {
                   if(array[i]>array[j])
                   {
                       temp=array[i];
                       array[i]=array[j];
                       array[j]=temp;
                      
                   }

                }
               
            }
                   // The final output 

                   for(int i=0;i<array.length;i++)
                    System.out.println("This Ascending Order : "+array[i]);
                    System.out.println
                    ("-----------------------------------");
                    for(int i=array.length-1;i>=0;i--)
                    System.out.println("This Descending Order : "+array[i]);
            
            
                
              }

    }

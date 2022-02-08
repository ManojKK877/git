 import java.util.Scanner;
 public class TransposeMatrix {
    public static void main(String[] args)
    {
        int i,j;
        Scanner scan= new Scanner(System.in);

  
    System.out.println("enter the n rows");
    int n=scan.nextInt();
    System.out.println("enter the n1 column:");
    int n1=scan.nextInt();
    int array[][]= new int[n][n1];
    System.out.println("enter the value :");

    for(i=0;i<n;i++)
   {
    for(j=0;j<n1;j++)
   {
         array[i][j]=scan.nextInt();
   }
   }
   System.out.println("Transpose of a Matrix:");
   for(i=0;i<n;i++)
   {
    for(j=0;j<n1;j++)
   {
         System.out.print(array[j][i]+" ");
         // System.out.println(" ");
   }
  
   System.out.println();
   }
    }
}

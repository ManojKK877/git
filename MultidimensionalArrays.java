  import java.util.Scanner;
  public class MultidimensionalArrays {
    public static void main(String[] args){
    int i,j,k;
    Scanner scan= new Scanner(System.in);
    
System.out.println("enter the n block array");
int n=scan.nextInt();
System.out.println("enter the n1 row:");
int n1=scan.nextInt();
System.out.println("enter the n2 column:");
int n2=scan.nextInt();
System.out.println("enter the value :");
int array[][][]= new int[n][n1][n2];

for(i=0;i<n;i++)
{
for(j=0;j<n1;j++)

{
    for(k=0;k<n2;k++)
    {
     array[i][j][k]=scan.nextInt();
        }
       }
     }
     for(i=0;i<n;i++)
{
for(j=0;j<n1;j++)

{
    for(k=0;k<n2;k++)
    {
     System.out.print(array[i][j][k]);
        }
        System.out.println( );
       }
       System.out.println( );
     }
   }
  }
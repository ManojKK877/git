public class pattern4 {
    public static void main(String[] args)
    {
        int n=9;
        for(int i=0;i<=n;i++)
        {
            for( int s=0;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++)
                {
                    System.out.print("*");
                }
            
          
            System.out.println(" ");
        }
    }
}
       

    
    






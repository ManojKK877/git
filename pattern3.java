public class pattern3 {
    public static void main(String[] args)
    {
        int n=9;
        for(int i=n;i>=0;i--)
        {
            for( int s=0;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++)
                {
                    System.out.print(i);
                }
            
       
            System.out.println(" ");
        }
    }
}
       

    
    






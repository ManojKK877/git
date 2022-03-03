public class Pattern_14 {
    /*
        1
       1  1
      1  2  1
     1  3  3  1
    1  4  6  4  1 
    */
    public static void main(String[] args)
    {   int c=1;
        for(int i=1;i<=5;i++)
        {
            for(int s=0;s<5-i;s++)
            {
                System.out.print(" ");
            }
            
        for(int j=1;j<=i;j++)
        {
            if(i==j)
              {
                System.out.print(c+" ");
              }
            else if(i==4 &&j==2 || i==5&&j==2|| i==5&&j==3)
              {
                if(i==5&&j==2)
                  {
                    System.out.print(j+2+" ");
                  }
                else if(i==5&&j==3)
                  {
                    System.out.print(j+3+" ");
                  }
                
                else
                System.out.print(j+1+" ");
              }
            else
            System.out.print(j+" ");
        }
        System.out.println("");
        }
    }
    
}

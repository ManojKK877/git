public class Pattern19 {
    
        /*
        *          n   i   j    j=i+1   = 0+1=1        
        **         5    0  1
        ***        5    1   2
        ****       5     2   3
        *****      5     3   4
                   5      4   5
        */
        public static void main(String[] args)     
        { 
            //int a=2;
       /* if(a>5 && a<10)
            {
                System.out.println(" YES");
            
            }
            else 
            System.out.println(" NO");*/
            String p="* ";
             int  n =5;     
            for(int i=0;i<=n;i++)
            {
                System.out.print(p);
                p+="*   ";
                System.out.println();
            }

        
    }
    
}

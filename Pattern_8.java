/*If the given string length is odd print the pattern below otherwise print 0.
// time take 2hours
p      M 
 R    A
  O  R
   G
  O  R
 R    A
P      M.*/


public class Pattern_8 {
    
    public static void main(String[] args)
    {
        String name="PROGRAM";
       
        int i,j;
        for(i=0;i<name.length();i++)
        {
             for(j=0;j<name.length();j++)
             {
                if(i==j)//||(name.length()-1-i)
                {
                  System.out.print(name.charAt(i));

                }
                else if((i+j)==(name.length()-1))
                {
                  System.out.print(name.charAt(j));
                }
                 else 
                 System.out.print(" ");

             }
             System.out.println();

            }
       
        /*char[] names=new char[name.length()];
        int i,j;
        // String convert to Character
        for( i=0;i<name.length();i++)
            {
             names[i]= name.charAt(i);
            }
          
             for(i=0;i<name.length();i++)
             {  
                 // 
                for(int s=0;s<=i;s++)
                   {
                     System.out.print(" ");
                   }
                     System.out.print(names[i]);
                  // print reverse order gaps
                 for(j=i;j<name.length()-i-1;j++)
                   {
                
                      System.out.print(" ");  
                   }
                 // the print Reverse Order
                 System.out.println(names[name.length()-i-1]);
              
             }*/
             

        

    
    }
}

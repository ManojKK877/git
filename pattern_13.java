public class pattern_13 {
    public static void main(String[] args)
    {/*
        12345
         234
          3
      /*
      123123123
       2312312   
        31231   
         123        
          2*/
         for(int i=3;i>0;i--)   
         {
             for(int s=0;s<3-i;s++)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<i*2;j++)
             {
                 if(i==2)
                 {
                     System.out.print(j+1);
                 }
                 else if (i==1)
                 {
                    System.out.print(j+2);  
                 }
                 else
                 System.out.print(j);

                 
             }
             System.out.println("");
         }
    }
    
}

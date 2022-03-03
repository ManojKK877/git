public class ModelProgram {
    public static void main(String[] args)
    {
      int a=1;
     
      do {

        a++;
        System.out.println(a);
        
      } while (a<=5);
      /*String name =" ";
      System.out.println(name.isBlank());*/
      /*String name ="Manoj";
      System.out.println(name.matches("\\w{5}"));*/
      String name ="manoaaja";
      char value= name.charAt(0);
      int count=0;
      for(int i=0;i<name.length();i++)
      {
        if(value==name.charAt(i))
        {
          count++;
        } 

      }
      System.out.println(count);
    String Name ="manoj";
    int count1=0;
    for(int i=0;i<Name.length();i++)
    {
      char Name1= Name.charAt(i);
      switch(Name1)
      {
        case 'a':
        
        case 'e':
        
        case 'i':
       
        case 'o':
       
        case 'u':
       count1++; 
      }
    }
    System.out.println(count1);
      
  

      /*  for(int i=4;i<=36;i+=4)
        {
           System.out.print(i+" ");
           //if(i%3==0)
           if(i==12||i==24||i==36)
           {
            System.out.println();
               continue;
              
           }
          // System.out.println();
          int n=5;
          for(int i=1;i<=n;i++)    
          {
        for(int j=1;j<=n;j++)
        {
            if(i==(n/2)+1||j==(n/2)+1)
            {
                System.out.print("*");
            }
             
            System.out.println();
        }
        System.out.println();


          }    
             */
            /* int i=1,total=1;
            int na=display(i,total);
            System.out.println(na);
        // System.out.println(name);
       /*for( char name=48; name<=57;name++)
        {
                System.out.println(name);
        }*/
               
       }
      
     
       /*public static int  display(int i,int total)
       {
         total=total*i;
         i++;
         if(i<=5)
        return display(i,total);
        else
         return total;
        
       }
      /* public static void  display1(int i)
       {
      
         i++;
         if(i<=5)
         display2(i);
         System.out.println(i);
        
       }
       public static void  display2(int i)
       {
        
         i++;
         if(i<=5)
         display3(i);
         System.out.println(i);
        
       }
       public static void  display3(int i)
       {
       
         i++;
         if(i<=3)
         display(i);
         System.out.println(i);
        
       }*/
}

        
    

public class arrayProgram {
    public static void main(String[] args)
    {
         int a[]={10,20,30,40,50,10,20,30,40,50,10,20,30,40,50};
         int i,count=0;
         
         for(i=0;i<a.length;i++)
         {
         int key=a[0];
         for(i=0;i<a.length;i++)
      {
            if(key==a[i])
            count++;
      }
      System.out.println(count);

    }
    }
    
}

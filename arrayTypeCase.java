public class arrayTypeCase {
    public static void main(String[] args)
    {  
        // Two Method Used
        //First FOR Method 
        int i;
        char[]  array ={'d','c','g'};
        // Type Casting For Loop
        for( i=0;i<array.length;i++)
             System.out.println("For Loop Char Convert to Integer Method : "+(int)array[i]);
        //Two FOR EACH Method 
        //Type Casting ForEach
         for(int array1 :array)
         System.out.println("ForEach Loop Char Convert to Integer :" +array1);
    }
    
}

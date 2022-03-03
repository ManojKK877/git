import java.lang.String;
import java.net.NoRouteToHostException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class StringLearn {
    public static void main(String[] args)
    {
        Scanner scan=new     Scanner(System.in);
        /*int [] array={20,50,60,85};
        int [] array1={10,20,30};
        int n=8;
        int c[]=new int [n];
        int i=0;
        for(i=0;i<array.length;i++)
        {
           c[i]=array[i];                    
       
        }
        int j=0;
        for(j=0;j<array1.length;j++)
        {
           c[i]=array1[j];
           i++;                    
       
        }
        for(i=0;i<=c.length;i++)
        System.out.println(c[i]);

        /*int a[]={10,-20,-80,100,-20};
        int i=0;
        int Negative=0;
        for(i=0;i<a.length;i++)
        {
             if(a[i]<0)
             Negative++;
        }
        System.out.println(Negative);
        int c[]=new int[8];
        int j=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
            c[j]=a[i];
            j++;
            }
    
        }
        //System.out.println(j);
       for(i=0;i<a.length;i++)
        if(a[i]>0)
            {
            c[j]=a[i];
            j++;
            }
        for(i=0;i<a.length;i++)
        System.out.println(c[i]);
        /*int [] a={10,20,50,20,52,60};
        int [] b={20,30,20};
        int len=a.length+b.length;
        int c[]=new int[len];
        int i=0;
        for( i=0;i<b.length;i++)
        {
            c[i]=b[i];
        }
        //System.out.println(i);
        int j=0;
        for(j=0;j<a.length;j++)
           { 
               c[i]=a[j];
    i++;
        }

       // c[i]=a[i];
        for( i=0;i<c.length;i++)
       { System.out.println(c[i]);
       }
       /* int[] array=new int[5];
        int i;
        for(i=0;i<array.length;i++)
        {
                array[i]=scan.nextInt();
        }
        int temp=array[0];
        for(i=0;i<array.length-1;i++)
        {
               array[i]=array[i+1];
        }
        array[i]=temp;
        for(i=0;i<array.length;i++)
              System.out.print(array[i]);
        
        /*String name="124";
        int type =Integer.parseInt(name);
        System.out.println(type);*/

       /* int n1=5,fact=n1;
   while(n1>1)
    {
    n1--;
    fact=fact*n1;
    
    }
    System.out.println(fact);*/ 
    /*String name=new String();
        name="nanoj kumar";
        System.out.println(name.replaceAll("\\s", "-"));
        
        System.out.println(name.join("_", "5","7","2000"));*/


      /* String s1="  ";
       String s2="hello";s
       System.out.println(s1.isBlank());
       String s1="java";
       String s2="jav";
       s2="jav "+"a";
       System.out.println(s2==s1);
       String  s1=new String("java");
       String  s2= new String ("Java");
System.out.println(s2.equalsIgnoreCase(s1));
String name ="manoj kumar";
for(int i=0;i<name.length();i++)
{
    char names=name.charAt(i);
    if(names=='a'||names=='e'||names=='i'||names=='o'||names=='u')
    {
System.out.println(names);*/

/*String name ="ooo";
int  count=0;//countofa=0,countofe=0,countofi=0,countofo=0,countofu=0;
char[] names1 ={'m','a','n','o','j'};
String value1=new String(names1);
System.out.println(value1);
for(int i=0; i<name.length();i++)
{
char names = name.charAt(i);
switch(names)
{
    case 'a' :
    count++;
    break;
    case 'e' :
    count++;
    break;
    case 'i' :
    count++;
    break;
    case 'o' :
    count++;
    System.out.println("the number of count value O IS:"+count);
    break;
    case 'u' :
    count++;
    break;
    default:
    
}*/

/*System.out.println("the number of count value O IS:"+countofo);
System.out.println("the number of count value I  IS:"+countofi);
System.out.println("the number of count value U IS:"+countofu);
System.out.println("the number of count value E IS:"+countofe);
System.out.println("the number of count value A IS:"+countofa);*/
int [] array={20,50,60,85};
        int [] array1={10,20,30};
        System.out.println(array.length+array1.length);

      int n=10;
      int secondmax=0;
      int thirdmax=0;
      int fourthmax=0;
      

       int [] mark=new int[n];
       for(int i=0;i<mark.length;i++)
       {
           mark[i]=scan.nextInt();
       }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(mark[i]>max)
           {
          
            //secondmax=max;
            max=mark[i];
           }
       
       else if(mark[i]>secondmax)
       {
           secondmax=mark[i];
       }
       else if(mark[i]>thirdmax)
       {
           thirdmax=mark[i];
       }
       else if(mark[i]>fourthmax)
       {
           fourthmax=mark[i];
       }
    }
    System.out.println("----------------------------");
       System.out.println(max);
        System.out.println(secondmax);
        System.out.println(thirdmax);
        System.out.println(fourthmax);

    }


}
    


    

 
    


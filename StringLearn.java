public class StringLearn {
    public static void main(String[] args)
    {
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
String name ="ooo";
int  count=0;//countofa=0,countofe=0,countofi=0,countofo=0,countofu=0;
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
    
}

/*System.out.println("the number of count value O IS:"+countofo);
System.out.println("the number of count value I  IS:"+countofi);
System.out.println("the number of count value U IS:"+countofu);
System.out.println("the number of count value E IS:"+countofe);
System.out.println("the number of count value A IS:"+countofa);*/
}
    }
}

    

 
    


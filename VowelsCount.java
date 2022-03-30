 import java.util.Scanner;
 public class VowelsCount {
    public static void main(String[] args)
    {
        int countofa=0,countofe=0,countofo=0,countofi=0,countofu=0;
        // find the  vowels 
        String name="manoj";
        for(int i=0; i<name.length();i++)
          {
        char names = name.charAt(i);

            switch(names)
          {
    case 'a' :
    countofa++;
    break;
    case 'e' :
    countofe++;
    break;
    case 'i' :
    countofi++;
    break;
    case 'o' :
    countofo++;
    break;
    case 'u' :
    countofu++;
    break;
    default:
    
}

}
System.out.println("the number of count value O :"+countofo);
System.out.println("the number of count value I :"+countofi);
System.out.println("the number of count value U :"+countofu);
System.out.println("the number of count value E :"+countofe);
System.out.println("the number of count value A :"+countofa);
    }
    
}

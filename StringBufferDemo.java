  import java.util.Scanner;
  public class StringBufferDemo {
    public static void main(String[] args)
    {
        String[] name= new String[5];
        Scanner scan= new Scanner(System.in);
        //name=scan.nextInt();
        for(int i=0;i<name.length;i++)
        {

            name[i]=scan.nextLine();

        }

       // System.out.println(name.replace(0,2,"ra"));
    }
    
}

// Write a program to find the area of the cylinder
import java.util.Scanner;
public class areaCylinder {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the Radius: ");
        float pi=3.14f;
        float radius=scan.nextInt();
        System.out.println("enter the height: ");
        float height=scan.nextInt();
        //Area of Cylinder Formula
        float Area=(2*pi*radius*height+2*pi*radius*radius);
         System.out.println("the Area of Cylinder:"+Area);
         scan.close();
    }
}

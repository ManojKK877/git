public class ConstructorLearn {
    String myNmae,yourCity;
    static int phone;

    public ConstructorLearn(String name,int phone,String City)
    {
         myNmae=name;
        yourCity=City;
       // phone =phone;
    }
    public static void main(String[] args)
    {
        String name ="manoj";
        String City ="namakkal";
ConstructorLearn object = new ConstructorLearn( name,phone, City);



    }
    
}
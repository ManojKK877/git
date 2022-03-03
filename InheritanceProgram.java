

 class college{
    
   
      //int price =199;
    college(int price)//constructor
    {

        System.out.println(" parent calss"+price);
    }
    String college_Name ="IRTT";
    String college_Located="Erod";
    int amount=2000;
    void display()//method calling
    {
        System.out.println(amount);
    }
     

}
class input extends college{
    int amount=1000;
    input(){
        super(100);
        System.out.println("child class");
        
    }
    void display()
    {
        //super.display();
        //System.out.println(super.amount);
        System.out.println(amount);
    }
String college_Name ="EXcel";
}
class InheritanceProgram  {
    
       public static void main(String [] args)
    {
        input  obj1= new input();
        obj1.display();
       


            
         
    }
}
import java.util.EnumSet;
enum Enumerations {
	 
    MANOJ,KUMAR,DINESH,HARI,aravindhan; 
   Enumerations(){
         System.out.println("I AM ENUM");
         
    }
    public static void mano()
    {
        System.out.println(" I AM ENUM METHODS");
    }
     public static void main(String[] args) {
           
             mano();
           
       }

    
}



/*enum Day{ 
  Sunday,Tuesday,Monday,Friday,Saturday,Weden;
    
}
 public class Enumeration {
    
    public static void main(String[] args)
    
    {   
     
        for(Day Var : EnumSet.range(Day.Sunday, Day.Saturday)){
           // System.out.println(Var);
        
        //Day myVar = Day.lower;//Day.middle;
       
        switch(Var)
        {
            default :
            System.out.println("Check the value");
            break;
            case Sunday:
            System.out.println("Sunday is Best Days");
            break;
            case Monday:
            System.out.println("Monday is boor Days");
            break;
            case Saturday:
            System.out.println("Saturaday is better Da");
            break;
            case Friday:
            System.out.println("F riday is noraml Days");
            break;

        }
        
    }
        /*for(int i=0;i<myVar.length;i++)
        {
            System.out.println(myVar[i]);
        }
        for(Day Var : myVar){
     System.out.println(Var);
        }
        
    
        


    }
    
}*/

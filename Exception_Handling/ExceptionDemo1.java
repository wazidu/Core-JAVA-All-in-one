
package Exception_Handling;


public class ExceptionDemo1 {
    
    public static void main(String[] args) {
     
        try{
 
        int x=10,y=0;
        int result=x/y;
        System.out.println("result: "+result);
        
        }catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Exception: "+e1);
        }catch(ArithmeticException e2)
        {
            System.out.println("Exception: "+e2);
        }catch(Exception e3)
        {
            System.out.println("eeeeeeeee");
        }
     
        finally  //always executes
        {
            System.out.println("Exception handling....");
        }
        
        
        
        
        
    }
    
}

class Xman{
    
    void display()
    {
        System.out.println("I am xmen");
    }
}

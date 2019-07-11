
package helloworld;

public class this_invoke_constructor {
    
}

class B
{

     B() {
         System.out.println("Hi its B");
    }
     
     B(int i)
     {
         this();
         System.out.println(i);
     }
    
     
     public static void main(String[] args) {
        B b=new B(40);
    }
}

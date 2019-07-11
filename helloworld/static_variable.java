
package helloworld;


public class static_variable {
    static int a=0;

     static_variable() {
         a++;
         System.out.println(a+"");
    }
    
     public static void main(String[] args) {
         static_variable s1=new static_variable();
         static_variable s2=new static_variable();
         
        
         
    }
    
    
    
}

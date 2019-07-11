
package helloworld;


public class Pass_arg_in_method {
    
    public static void main(String[] args) {
        s2 t=new s2();
        
        t.p();
    }
    
}

class s2
{
    void m(s2 obj)
    {
        System.out.println("Method invoked");
        
        
    }
    
    void p()
    {
        
        m(this);
    }
    
    
}

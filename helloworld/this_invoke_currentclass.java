
package helloworld;


public class this_invoke_currentclass {
    
}

class Abb
{
    void m()
    {
        System.out.println("hi bd");
    }
    void n()
    {
        System.out.println("hi");
        
        this.m();
    }
    
    public static void main(String[] args) {
        
        Abb a= new Abb();
        
        a.n();
    }
}

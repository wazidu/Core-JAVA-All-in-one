
package helloworld;

public class Constructor {
    
    public static void main(String[] args) {
        A a=new A();
        a.s="Murad";
        a.display();
    }
    
}
class A
{
    int a;
    String s;
    A()
    {
        System.out.println("object created"); 
    }
    
    void display()
    {
        System.out.println(a+"  "+s);
    }
}

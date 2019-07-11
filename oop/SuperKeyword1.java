
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class SuperKeyword1 {
    public static void main(String[] args) {
        B1 b=new B1();
        b.display();
    }
    
}

class A1
{
    int x=5;
    
}
class B1 extends A1
{
    int x=10;
    
    void display()
    {
        System.out.println(x);
        System.out.println(super.x);
    }
}

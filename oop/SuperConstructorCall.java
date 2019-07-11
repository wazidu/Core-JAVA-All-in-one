
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class SuperConstructorCall {
    public static void main(String[] args) {
        B5 b=new B5();
    }
    
    
}
class A5
{

     A5() {
         System.out.println("A's constructor");
    }
    
}
class B5 extends A5{

    public B5() {
        System.out.println("B con");
    }
    
    
    
}

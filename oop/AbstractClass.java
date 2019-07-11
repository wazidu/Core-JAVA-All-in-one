
package oop;


public class AbstractClass {
    public static void main(String[] args) {
        Mobile m; //reference variable ....cant create object
        m=new Rahim();
        m.message();
    }
    
}
abstract class Mobile
{
    abstract void message();
}

class Rahim extends Mobile
{
    @Override
    void message()
    {
        System.out.println("i am rahim");
    }
}
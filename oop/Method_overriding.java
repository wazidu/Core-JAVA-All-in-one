
package oop;


public class Method_overriding {
    public static void main(String[] args) {
        Teacher3 t=new Teacher3();
        
        t.name="Murad";
        t.age=10;
        t.Quali="BSC";
        t.displayinfo();
    }
    
}

class Person
{
    String name;
    int age;
    
    void displayinfo()
    {
        System.out.println(name+"   "+age);
    }
}
class Teacher3 extends Person
{
    String Quali;
    
    @Override
    void displayinfo()
    {
        System.out.println(name+"  "+age+" "+Quali);
    }
}
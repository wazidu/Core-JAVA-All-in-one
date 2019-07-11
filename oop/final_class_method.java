
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class final_class_method {
    public static void main(String[] args) {
        student s=new student();
        s.display();
        s.display2();
    }
    
}
class University
{
    final void display()
    {
        System.out.println("Mawlana Bhashani Science & Technology");
    }
}
class student extends University
{
   /* @Override  cant overr.. bcz its final
    void display()
    {
        super.display();
        System.out.println("ICT,MBSTU");
    }*/
    
    void display2()
    {
        super.display();
        System.out.println("ICT,MBSTU");
    }
}
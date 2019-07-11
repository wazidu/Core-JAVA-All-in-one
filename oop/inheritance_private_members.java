
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class inheritance_private_members {
    private String Name;
    private  int id;
    
    public void setinfo(String n,int i)
    {
        this.Name=n;
        this.id=i;
    }
    
    public String getName()
    {
        return  Name;
    }
    public int getID()
    {
        return  id;
    }
    void display()
    {
        System.out.println(Name+"  "+id);
    }
    
}
class Teacher1 extends inheritance_private_members
{
    String Qualification;
    
    void display2()
    {
       display();
        System.out.println(Qualification);
    }
 
}
class test
{
    public static void main(String[] args) {
        Teacher1 t1=new Teacher1();
        
        t1.Qualification="BSC";
        //inheritance_private_members i1=new inheritance_private_members();
        
        t1.setinfo("Murad", 16010);
        //i1.setinfo("Murad", 16010);
       // i1.display();
        t1.display2();
    }
}

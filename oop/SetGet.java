
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class SetGet {
    
    private String name;
    private int id;
    
    public void setinfo(String n,int i)
    {
        this.name=n;
        this.id=i;
    }
    public String  a()
    {
        return name;
        
    }
    public int b()
    {
        return id;
    }
    
}

class B{
    
    public static void main(String[] args) {
        SetGet s=new SetGet();
        
        s.setinfo("Murad", 16010);
        
        System.out.println(s.a()+"   "+s.b());
        
    }
}

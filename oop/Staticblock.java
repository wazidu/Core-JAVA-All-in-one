
package oop;

/**
 *
 * @author WazidUllah
 */
public class Staticblock {
   
    
    static int id;
    static String n;
    
    static {
        
        id=16010;
        n="Wazid ullah Murad";
    }
    
    static void display()
    {
        System.out.println(id+"    "+n);
    }
    
}

class A{
    
    public static void main(String[] args) {
        Staticblock.display();
    }
}


package helloworld;

/**
 *
 * @author wazidullah_murad
 */
public class Student {
    int n=9;
    
    String p="Murad";
    
    public static void main(String args[])
    {
        Student s= new Student();
        Student1 s1=new Student1();
        Student1 s2=new Student1();
        
        System.out.println(s.n);
        System.out.println(s.p);
        s1.q=40;
        s2.q=41;
        System.out.println(s1.q);
        System.out.println(s2.q);
        System.out.println(s1.q);
        
        Student2 s3=new Student2();
        Student2 s4=new Student2();
        
        s3.win(3, "brazil");
        s4.win(4, "Argentina");
        s3.print();
        s4.print();
        new Student2().win(7, "bra");
        new Student2().print();
    }
    
}

 class Student1{
    
    int q;
    String r="Wazid";

     Student1() {
         System.out.println("object created");
        
    }
    
}

class Student2{
    
    int argentina;
    String brazil;
    
    void win(int n, String m)
    {
        argentina=n;
        brazil=m;
    }
    void print()
    {
        System.out.println(argentina+" "+brazil);
    }
    
}


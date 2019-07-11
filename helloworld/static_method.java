
package helloworld;

import javax.script.ScriptEngine;


public class static_method {
    int id;
    String name;
    static String college1="MWC";

    
    
    
    
    static void a()
    {
       //id=i;
       // name = "AMC";
        college1="AMC";
        
    }
    
    static_method(int i,String n) {
        id=i;
        name=n;
        
    }
    void display()
    {
        System.out.println(id+" "+" "+name+" "+college1);
    }
    
    public static void main(String[] args) {
        
        static_method s1=new static_method(1,"Murad");
        static_method s2=new static_method(2,"Johny");
       // s1.a
        s1.display();
        s2.display();
        
    }
    
}

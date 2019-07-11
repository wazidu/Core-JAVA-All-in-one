/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wazidullah_murad
 */
public class Constructor_overloading {
    int id;
    String name;
    int age;

     Constructor_overloading(int i,String s)
     {
         id=i;
       name=s;
         
    }
    Constructor_overloading(int k, String s2, int a)
    {
       id=k;
        name=s2;
       age=a;
    }
    void display()
    {
        System.out.println("id: "+id+" name: "+name+" age: "+age);
    }
    
    
    public static void main(String[] args) {
        
        Constructor_overloading p1=new Constructor_overloading(5, "Murad");
        Constructor_overloading p2=new Constructor_overloading(6, "Johny", 10);
        p1.display();
        p2.display();
        
        
    }
    
    
}

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
public class thisextra {
    
    public static void main(String[] args) {
        X s1=new X(1, "Murad");
        X s2=new X(2, "johny", 22);
        
        s1.display();
        s2.display();
    }
    
}
class X
{
    
    int id;
    String name;
    int age;

    X(int id,String name) {
        this.id=id;
        this.name=name;
    }
    
    
    X(int id,String name,int age) {
       this.age=age;
       
       //this();
    }
    
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class this1 {
    public static void main(String[] args) {
        x1 y=new x1("johny", 0);
        x1 x=new x1("Murad", "black", 10);
        y.display();
        x.display();
    }
    
}
class x1
{
    String name,hair;
    int age;

    public x1(String name,  int age) {
        this.name = name;
        this.age = age;
    }

    public x1(String name, String hair, int age) {
        this(name, age);
        this.hair = hair;
      
    }
    
    void display()
    {
        System.out.println(name+"  "+hair+"  "+age);
    }
    
}
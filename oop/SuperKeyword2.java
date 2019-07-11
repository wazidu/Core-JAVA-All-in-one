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
public class SuperKeyword2 {
    public static void main(String[] args) {
        B4 b=new B4();
        b.display();
        
    }
    
}

class A4
{
    void display()
    {
        System.out.println("super class");
    }
}
class B4 extends A4
{
     void display()
    {
        super.display();
        System.out.println("child class");
    }
    
}

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
public class interface1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    
          
    }
    
}

interface Animal
{
    void sound();
    
}
class Dog implements Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog can eat egg");   
    }
    
}
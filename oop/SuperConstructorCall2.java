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
public class SuperConstructorCall2 {
    public static void main(String[] args) {
        Car c=new Car(100, "blue", 50);
        c.display();
        
    }
    
}

class Vehicle
{
    String color;
    int weight;

     Vehicle(String c,int w) {
         color=c;
         weight=w;
    }
    void display()
    {
        System.out.println(color+"   "+weight);
    }
    
}
class Car extends Vehicle
{
    int gear;

    public Car(int gear, String c, int w) {
        super(c, w);
        this.gear = gear;
    }
    
    @Override
    void display()
    {
        super.display();
        System.out.println(gear);
    }
}

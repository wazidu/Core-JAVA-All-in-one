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
public class instance_of_inheritance {
    public static void main(String[] args) {
        animal a= new animal();
        person p= new person();
        Teacher2 t=new Teacher2();
        
        System.out.println(p instanceof animal);
        System.out.println(a instanceof animal);
        System.out.println(t instanceof  animal);
        System.out.println(a instanceof  Teacher2);
        
        
    }
    
}
class animal{
    
    
}
class person extends animal
{
    
}
class Teacher2 extends person
{
    
}
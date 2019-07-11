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
public class Anonymous_class {
    public static void main(String[] args) {
        Book b=new Book(){
            
            @Override
            void display()
            {
                System.out.println("Book");
            }
            
        };
        
        b.display();
    }
    
}
class Book{
    
    void display()
    {
        System.out.println("Microprocessor");
    }
}

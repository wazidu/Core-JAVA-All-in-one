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
public class ToString {
    public static void main(String[] args) {
        
        book b1=new book("OS", 1);
        book b2=new book("Microprocessor", 2);
        
        System.out.println(b1);
        System.out.println(b2);
        
    }
    
}
class book{
    String name;
    int id;
    
    book(String name,int id)
            
    {
        this.id=id;
        this.name=name;
    }
    
    @Override
   public String toString()
   {
      return  name+"  "+id;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.LinkedList;

/**
 *
 * @author WazidUllah_Murad
 */
public class StudentList_Linkedlist {
    public static void main(String[] args) {
        LinkedList <student> s1=new LinkedList<student>();
        
        student s2=new student("Murad", "Mbstu", 10);
        student s3=new student("rad", "Mbstu", 10);
        
        s1.add(s2);
        s1.add(s3);
        
        for (student b : s1) {
            System.out.println(b.id+" "+b.name+b.class1);
            
        }
        
    }
    
}

class student
{
    String name,class1;
    int id;

    public student(String name, String class1 , int id) {
        this.name = name;
        this.class1 = class1;
        this.id = id;
    }
    
    
}

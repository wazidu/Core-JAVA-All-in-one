/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;

/**
 *
 * @author wazidullah_murad
 */
public class ArrayListDemo2 {
    
    public static void main(String[] args) {
        
        
        ArrayList <Integer> number1= new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        
        System.out.println("Number 1 : "+number1);
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        System.out.println("Number 2 : "+number2);
        
        number3.addAll(number1);
        System.out.println("Number 3: "+number3);
        
        boolean b = number1.equals(number2);
        System.out.println(""+b);
        boolean c=number1.equals(number3);
        System.out.println(""+c);
    }
    
}

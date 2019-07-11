/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author wazidullah_murad
 */
public class ArrayListDemo3 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number1 =new ArrayList<>();
        
        number1.add(-200);
        number1.add(100);
        number1.add(1);
        number1.add(50);
        
        System.out.println("Befor sorting "+number1);
        
        Collections.sort(number1);
        
        System.out.println("After sorting "+number1);
        
        Collections.sort(number1,Collections.reverseOrder());
        
        System.out.println("After reverse "+number1);
    }
    
}

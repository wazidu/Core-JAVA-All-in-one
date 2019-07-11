/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_package;

/**
 *
 * @author wazidullah_murad
 */
public class StringDemo3 {
    public static void main(String[] args) {
        
        String bd="    Bangladesh is a country";
        
        char ch= bd.charAt(0);
        System.out.println(ch);
        
        int value=bd.codePointAt(4);
        System.out.println(value);
        
        int pos=bd.indexOf('g');
        System.out.println(pos);
        
        pos=bd.lastIndexOf('a');
        System.out.println(pos);
        
        String d1= bd.trim();
        System.out.println(d1);
        
    }
    
}

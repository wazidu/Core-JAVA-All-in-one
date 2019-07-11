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
public class StringDemo1 {
    
    public static void main(String[] args) {
        
        String s1="Murad";
        String s2= new String("murad");
        
        System.out.println(s1+"");
        System.out.println(s2);
        
        char[] c={'M','u','r','a','d'};
        System.out.println(c);
        
        if(s1.equals(s2))
            System.out.println("equal");
        else
            System.out.println("Not equal");
        if(s1.contains(s2))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        if(s1.contains("ur"))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equals");
        
        boolean e=s1.isEmpty();
        
        System.out.println(""+e);
    }
    
}

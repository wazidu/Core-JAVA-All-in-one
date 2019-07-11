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
public class StringDemo6 {
    public static void main(String[] args) {
        String s1="aaa";
        
        StringBuffer sb=new StringBuffer(s1);
        
       String s2= sb.reverse().toString();
        if(s2.equals(s1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}

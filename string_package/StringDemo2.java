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
public class StringDemo2 {
    public static void main(String[] args) {
        
        String firstName= "Wazid Ullah ";
        String lastName= "Murad";
        
        //String fullName= firstName+lastName;
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);
        
        String lowerName=fullName.toLowerCase();
        System.out.println(lowerName);
        
        boolean r= fullName.startsWith("W");
        System.out.println(r);
        r= fullName.startsWith("Waz");
        System.out.println(r);
        
        boolean last= fullName.endsWith("ad");
        System.out.println(last);
        
        String[] names={"Murad","jony","tony"};
        
        for (String x: names)
            System.out.println(x);
        
        String f= "1234";
        Integer q=Integer.valueOf(f);
        System.out.println(q);
    }
    
}

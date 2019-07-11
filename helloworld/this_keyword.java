/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wazidullah_murad
 */
public class this_keyword {
    
    int roll;
    String name;
    String address;

     this_keyword(int roll, String name, String address) {
       this.roll = roll;
        this.name = name;
        this.address = address;
    }
    void diplay()
    {
        System.out.println(roll+" "+name+" "+address);
    }
    
    public static void main(String[] args) {
        
        this_keyword t1=new this_keyword(1, "Murad", "gfn");
        this_keyword t2=new this_keyword(2, "Johny", "panchua");
        
        t1.diplay();
        t2.diplay();
    }
    
    
}

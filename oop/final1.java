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
public class final1 {
    public static void main(String[] args) {
        x2 x=new  x2();
        //x.uni="  ";  //not possible
        x.display();
    }
    
}
class x2
{
final String uni="MBSTU";
final int fee;//blank final

    public x2() {
        fee = 5000;
    }

void display()
{
    System.out.println(uni+"   "+fee);
}

}
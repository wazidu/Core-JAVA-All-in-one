/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author WazidUllah
 */
public class hellobd {
    
    public static void main(String[] args) {
        
        LocalTime time=LocalTime.now();
        
        System.out.println(time);
        Date date=new Date();
        System.out.println(date);
        Scanner sc=new Scanner(System.in);
        
        int i=sc.nextInt();
        
        System.out.println(i);
        System.out.println(time);
        6
                
        for(int k=1;k<=5;k++)
            System.out.println(date+"   "+time);
        //System.out.println("Wazid ullah Murad");
    
}

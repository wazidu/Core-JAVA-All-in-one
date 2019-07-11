
package helloworld;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Arraylist1   {
    
    public static void main(String args[]){
    
    ArrayList<Integer> number= new ArrayList<Integer>();
    System.out.println(number.size());
    
    
    
    number.add(500);
    number.add(20);
    number.add(5);
    System.out.println(number);
    
    Collections.sort(number);
    
   int i;
   
        System.out.println("MAX-SIZ "+Double.valueOf("776.87"));
   
    //by for each loop
    
    for(int x: number)
    {
        System.out.println(x);
    }
    
    //by iterator
    
    Iterator itr= number.iterator();
    
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    
        System.out.println(number);
     boolean b=number.isEmpty();
     if(b==true)
            System.out.println("Empty");
     else
            System.out.println("Not empty");
    //number.clear(); 
    boolean c=number.isEmpty();
     if(c==true)
            System.out.println("Empty");
     else
            System.out.println("Not empty");
    boolean con =number.contains(20);
        System.out.println("contains: "+con);
    int pos=number.indexOf(500);
        System.out.println(pos);
        number.set(2, 10);
        System.out.println(number);
        int x = number.get(2);
        System.out.println(x);
    
    }
    
}


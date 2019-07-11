
package RandomTest;

import java.util.Random;

/**
 *
 * @author wazidullah_murad
 */
public class RandomDemo {
    
    public static void main(String[] args) {
        
        Random rand =new Random();
        System.out.println("hi");
        
        
        
        int r= rand.nextInt(10);
        System.out.println(r);
        
        int p=(int)(Math.random()*10)+1;
        
        System.out.println(p);
        
        System.out.println("hi");
    }
    
}

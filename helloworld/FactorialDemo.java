
package helloworld;

/**
 *
 * @author WazidUllah
 */
public class FactorialDemo {
    
    int fact(int k)
    {
        if(k==1)
            return 1;
        else
            return  k*fact(k-1);
    }
    
}

class B1{
    
    public static void main(String[] args) {
        FactorialDemo f=new FactorialDemo();
        System.out.println(f.fact(6));
        
    }
}

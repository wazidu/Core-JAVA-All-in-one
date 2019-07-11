
package helloworld;
import java.text.DecimalFormat;


public class DecinalFormat {
    public static void main(String[] args) 
    {
        DecimalFormat ob=new DecimalFormat("0.000");
        
        double a=2.98765432;
        System.out.println(ob.format(a));
        
    }
    
}

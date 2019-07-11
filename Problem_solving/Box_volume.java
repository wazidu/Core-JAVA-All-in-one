
package Problem_solving;

/**
 *
 * @author WazidUllah
 */
public class Box_volume {
    
    double height,width,depth;

    public Box_volume(double b,double c,double d)
    {
        height=b;
        width=c;
        depth=d;
    }
    
    void displayVol()
    {
        
        System.out.println("volume is : "+height*width*depth);
    }
    
}
class  A
{
    public static void main(String[] args) {
        Box_volume b1=new Box_volume(10,10,10);
        Box_volume b2=new Box_volume(20,30,10);
        
        b1.displayVol();
        b2.displayVol();
    }
}

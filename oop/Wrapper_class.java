
package oop;

public class Wrapper_class {
    public static void main(String[] args) {
        
        //primitive to object
        
        int x=10;
        
        Integer y=Integer.valueOf(x);
        System.out.println(y);
        
        //object to primitive
        
        Double d=new Double(100.45);
        
        double e=d.doubleValue();
        System.out.println(e);
    }
    
}


package helloworld;

public class HelloWorld {
    
     static int i=30;

    
    public static void main(String[] args) {
        byte c=9,d=8;
        byte e=(byte) (c+d);
        System.out.println(e);
        int a=8; int q = -8;
         float f= 11.5f;
     //a= (int) f;
     System.out.println(10<<2);    //10*2^2=10*4=40  
     System.out.println(10>>2);    //10/2^2=10/4=2  
     System.out.println(~a);
     System.out.println(~q);
        System.out.println(" Hello World");
       //System.out.println(i);
        System.out.println(a);
        a();
        a();
        a();
    }
    
     static void a()
    {
         
        System.out.println(i++);
    }
}

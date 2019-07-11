
package oop;

/**
 *
 * @author WazidUllah_Murad
 */
public class Shape_poly {
    double area()
    {
        return 0;
    }
    
}
class Rectangle extends Shape_poly
{
    double l,w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    @Override
    double area()
    {
        return l*w;
    }
}
class Triangle extends Shape_poly
{
    double h,w;

    public Triangle(double h, double w) {
        this.h = h;
        this.w = w;
    }
    @Override
    double area()
    {
        return .5*h*w;
    }
}
class Test1
{
    public static void main(String[] args) {
        Shape_poly s=new Shape_poly();
        s=new Rectangle(5, 6);
        System.out.println(s.area()); 
        s=new Triangle(5, 6);
        System.out.println(s.area()); 
        
        Triangle t=new Triangle(2, 3);
        System.out.println(t.area()); 
        
    }
}

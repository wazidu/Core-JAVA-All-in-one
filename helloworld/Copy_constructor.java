
package helloworld;


public class Copy_constructor {
    public static void main(String[] args) {
        
        student6 s1=new student6(100,"Murad");
        student6 s2=new student6(s1);
        s1.disp();
        s2.disp();
        
    }
    
}
class student6{
int id;
String name;

student6(int i,String s)
{
  id=i;
  name=s;

}

student6(student6 u)
{
    id=u.id;
    name=u.name;
    
}
void disp()
{
    System.out.println(id+" "+name);
}
}

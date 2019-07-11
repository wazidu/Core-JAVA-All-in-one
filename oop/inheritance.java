
package oop;


 public class inheritance {
     
      String Name;
    int id;
    
  void diplay()
    {
        System.out.println("Name: "+Name+"  "+"id: "+id);
    }
    
}

class Teacher extends inheritance
{
    String Quali;
    
    void display2()
    {
       diplay();
        System.out.println(Quali);
        
    }
}
class Test{
    public static void main(String[] args) {
        inheritance i=new inheritance();
        Teacher t=new  Teacher();
        i.Name="Murad";
        i.id=16010;
        t.Quali="BSC";
        t.display2();
        t.Name="Johny";
        t.id=55;
        t.display2();
        t.diplay();
        i.diplay();
    }
}

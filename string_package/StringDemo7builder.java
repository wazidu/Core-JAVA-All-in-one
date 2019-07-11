
package string_package;


public class StringDemo7builder {
    
    public static void main(String[] args) {
        
        StringBuilder str= new StringBuilder("Wazid Ullah");
        System.out.println(str);
        str.append(" Murad");
        System.out.println(str);
        str.delete(2, 5);
        System.out.println(str);
        
    }
    
}

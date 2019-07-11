
package string_package;

/**
 *
 * @author wazidullah_murad
 */
public class StringDemo5 {
    
    public static void main(String[] args) {
        
        StringBuffer sb= new StringBuffer("Wazid Ullah");
        System.out.println(sb);
        
        sb.append(" Murad");
        System.out.println(sb);
       // sb.reverse();
       // System.out.println(sb);
       
       sb.delete(0, 3);
        System.out.println(sb);
    }
    
}

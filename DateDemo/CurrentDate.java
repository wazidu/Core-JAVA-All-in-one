
package DateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author wazidullah_murad
 */
public class CurrentDate {
    
    public static void main(String[] args) {
        Date date=new Date();
       System.out.println(date);
        
        DateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY");
        
        String a=dateFormat.format(date);
        System.out.println(a);
    }
    
}

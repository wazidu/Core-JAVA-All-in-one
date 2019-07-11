
package list;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> customer =new HashMap<>();
        
        customer.put(10, "Murad");
        System.out.println(customer.get(10));
        customer.put(11, "johny");
        customer.put(12, "tony");
        System.out.println(customer.get(11));
    }
    
}


package helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        
        int[] b={ 100,8,-20,1,2,3,4};
        Arrays.sort(b);
        System.out.println(b[0]);
        Scanner sc=new Scanner(System.in);
        
        int[] a=new int[10];
        
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println("value :"+a[i]);
        }
        
        
        
    }
            

    
    
    
}

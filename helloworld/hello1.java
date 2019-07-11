/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;

/**
 *
 * @author WazidUllah_Murad
 */
public class hello1 {
    
    
    public static void main(String[] args) {
        System.out.println("number of elements: ");
        int i,j,k,value,hole,n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
     int[] a=new int[n];
        
        System.out.println("Enter the elements");
        
        for ( i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            
        }
        
          insertionSort(a,n);
        
        System.out.println(a);  
        
    }
    
    public static void insertionSort(int a[],int n)
    {
        for (int i=1;i<n;i++)
        {
            int value=a[i];
            int hole=i;
            while(hole>=0 && (hole-1)>value)
            {
                a[hole]=a[hole-1];
                hole--;
                
            }
        }
        
    }
    
}

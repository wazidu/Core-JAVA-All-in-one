
package Exception_Handling;

import java.util.Scanner;


public class problemSolving1 {
    public static void main(String[] args) {
        int num1,num2,result;
       
        
        while (true) {
            try{
                 Scanner sc=new Scanner(System.in);
            System.out.println("Enter num1:");
            num1=sc.nextInt();
            System.out.println("Enter num2:");
            num2=sc.nextInt();
            System.out.println("Result: "+num1/num2);  
            }catch(Exception e)
            {
                System.out.println("Exception: "+e);
                System.out.println("you must enter integer...");
            }
        }
    }
    
}


package helloworld;


public class Account {
    int acno;
    int amount;
    String name;
    
    void insert(int n,String m,int a)
    {
        acno=n;
        name=m;
        amount=a;
        System.out.println("Account no "+acno+" inserted");
        
    }
    
            
    void deposit(int a)
    {
        amount=amount+a;
        System.out.println(a+" tk deposited");
        
    }
    void withdraw(int a)
    {
        if(amount<a)
            System.out.println("insufficient balance");
        else
        {
            amount=amount-a;
            
            System.out.println(a+" tk withdrawn");
        }
    }
    void balance_check()
    {
        System.out.println("Now balance is :"+amount+" tk");
        
    }
    
    void display()
    {
        System.out.println("Account No: "+acno+"\n"+"Account Name: "+name+"\n"+"Account Balance: "+amount);
    }
    
}

class TestAccount
{
    
    public static void main(String[] args) {
        
        Account ac=new Account();
        
        ac.insert(1, "Murad", 500);
        ac.display();
        ac.deposit(400);
        ac.balance_check();
        ac.withdraw(100);
        ac.balance_check();
        
        
        
        
        
    }
}

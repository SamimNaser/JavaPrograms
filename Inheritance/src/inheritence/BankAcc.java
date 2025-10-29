// Program: Bank Account and Savings Account Using Inheritance  
// Topic: Inheritance and OOP Concepts  
// Description: Demonstrates single inheritance where a base class `BankAcc` defines common account features  
// like deposit, withdraw, and balance check, and a derived class `SavingsAcc` adds interest calculation.  
// The program creates objects of both classes to show reusability and extension of base class properties.
package inheritence;
/**
 *
 * @author Samim
 */
class BankAcc {
    protected static int NextAccno=1;
    protected String FirstName;
    protected String SurName;
    protected String Address;
    protected int Accno;
    protected long Balance;
    public BankAcc(String fn,String sn,String ad){
        FirstName=fn;
        SurName=sn;
        Address=ad;
        Balance=0;
        Accno=NextAccno;
        ++NextAccno;
    }
    
    public long GetBalance(){
        return (long) Balance;
    }
    
    public void Deposit(long Amount){
        Balance=Balance+Amount;
    }
    
    public void Withdraw(long Amount){
        if((Balance-Amount)>1000){
            Balance=Balance-Amount;
        }
        else{
            System.out.println("Cant Withdraw !");
            System.out.println("Balance After Withdraw Will be < 1000");
        }
    }
    public void Display(){
        System.out.println("\n Customer "+FirstName+" "+SurName);
        System.out.println("Account Number :"+Accno);
        System.out.println("Account Balance :"+Balance);
    }
}
class SavingsAcc extends BankAcc{  
    private double rate;
    public void AddInterest(int month){
        double interest;
        double a = (double) month/12;
        interest=(double)(((Balance*rate*a)/100));
        double Balance1=(double) (Balance+interest);
        Balance = (long) Balance1;
        System.out.println("Balance With Interest :"+Balance);
    }
    
    public SavingsAcc(String fn,String sn,String ad,double r){
        super(fn,sn,ad);
        rate=r;
    }
    
    public static void main(String[]args){
        BankAcc b1,b2;
        b1=new BankAcc("Sk Samim","Naser","Newtown");
        b2=new BankAcc("Jack","Kallis","ACT-20"); 
        
        b1.Deposit(550000);
        b1.Display();
        
        b1.Withdraw(10000);
        b1.Withdraw(40000);
        b1.Display();
        
//        b2.Deposit(500000);
//        b2.Withdraw(200000);
//        b2.Display();
        
        SavingsAcc depacc;
        depacc=new SavingsAcc("Tom","Ellis","Action Area 2",7.0);
       
        depacc.Deposit(9000);
        depacc.Display();
        depacc.AddInterest(7);
    }
}


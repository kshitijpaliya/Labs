import java.util.Scanner;
class Account 
{
    String name;
    int accountno;
    String type;
    int balance;
    Scanner sc = new Scanner(System.in);
    Account(){
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the account number:");
        accountno=sc.nextInt();
        //System.out.println("Enter the type:");
    }
    
    void deposit(int value)
    {
        balance+=value;
        System.out.println("Deposited="+value);
    }
    
    void withdraw(int value){
        if(balance<value)
        {
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=value;
        System.out.println("Withdrawal="+value);

    }
    
    void display_balance(){
        System.out.println("Balance= "+balance);
    }

}
class Savings extends Account{
    double interest;
    double rate;
    void Interest()
        {
            System.out.println("Enter Rate");
            double rate=sc.nextDouble();
            interest=(rate/100)*balance;
            System.out.println("Interest="+interest);
            balance+=interest;
            //System.out.println("Balance="+balance);
        }
    Savings(){
        super();
        System.out.println("The account type is Savings");
        this.type="Savings";
//        System.out.println("Enter the amount to deposit");
//        int value=sc.nextInt();
//        deposit(value);
        
    }   
}


class Current extends Account{
    double service;
    void Service()
        {
            System.out.println("Enter Service Charge");
            double service=sc.nextDouble();
            double mab=10000;
            if(balance<mab){
               service*=balance;
           }
        }
    Current()
    {
        super();
        System.out.println("The account type is Current");
        this.type="Current";
//        System.out.println("Enter the amount to deposit");
//        int value=sc.nextInt();
//        deposit(value);
        
    }
    
            
}
public class Bank {
    public static void main(String[] args) {
        Savings s1 = new Savings();
        s1.deposit(100000);
        s1.withdraw(200);
        s1.Interest();
        s1.display_balance();
        Current c1 = new Current();
        c1.deposit(100000);
        c1.withdraw(10000);
        c1.Service();
        c1.display_balance();
    }
}

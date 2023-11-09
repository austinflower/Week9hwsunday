package q10;

public class CheckingAccount extends BankAccount{
    double withdrawalFee;
    public CheckingAccount (double initialBalance, double withdrawalFee){
        super(initialBalance);
        this.withdrawalFee = withdrawalFee;
    }
    @Override
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= (amount + withdrawalFee);
            System.out.println("Checking account withdrwan: $" + amount);
            System.out.println("fee charged: $"+ withdrawalFee);

        }else {
            System.out.println("Insufficient funds");
        }
    }
    public static void main (String [] args){
        SavingAccount savingsAccount = new SavingAccount(5000, 300);
        CheckingAccount checkingAccount = new CheckingAccount(1000, 25);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(50000);
        checkingAccount.deposit(500000000);
        checkingAccount.withdraw(500000);

    }




}

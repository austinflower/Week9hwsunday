package q3;

public class SavingAccount extends BankAccount{
    @Override
    public void withdraw(int amount){
    if (balance - amount >100){
        super.withdraw(amount);
    }else {
        System.out.println("minimum balance 100 is required");
    }
    }



    public static void main(String [] args){
       SavingAccount m1 = new SavingAccount();
       m1.deposit(300);
       m1.withdraw(1000 );



    }
}

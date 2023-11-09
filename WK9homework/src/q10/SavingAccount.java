package q10;

public class SavingAccount extends BankAccount {
    double withdrawalLimit;

    public SavingAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw form Saving account: $" + amount);

        } else {
            System.out.println("Failed withdrawal.");
        }
    }
}


package q12;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    public void setbalance(int balance){this.balance = balance;}

    public static void main(String []args){
        BankAccount b = new BankAccount();
        b.setAccountNumber(1234567);
        b.setbalance(6000000);
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
    }
}

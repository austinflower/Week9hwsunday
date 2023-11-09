package q3;

public class BankAccount {
    int balance;
    public void BankAccount (){
    balance = 0;}



    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);

    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("insufficient balance");

        }
    }}
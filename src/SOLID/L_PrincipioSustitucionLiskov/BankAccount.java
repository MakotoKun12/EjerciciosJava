package SOLID.L_PrincipioSustitucionLiskov;

class BankAccount {
    protected double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }else {
            throw new IllegalArgumentException("Insufficient founds");
        }
    }
}

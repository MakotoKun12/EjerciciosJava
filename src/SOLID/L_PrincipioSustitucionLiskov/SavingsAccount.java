package SOLID.L_PrincipioSustitucionLiskov;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += balance * interestRate;
    }

    // Overriding withdraw method to restrict withdrawals to a certain limit
    @Override
    public void withdraw(double amount) {
        if (amount > 1000) { // Limiting withdrawal amount for SavingsAccount
            throw new IllegalArgumentException("Withdrawal amount exceeds limit");
        }
        super.withdraw(amount);
    }
}

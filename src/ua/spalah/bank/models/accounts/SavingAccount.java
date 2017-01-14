package ua.spalah.bank.models.accounts;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class SavingAccount implements Account {

    private double balance;

    public SavingAccount(double balance) {
        if (balance < 0) {
            System.out.println("Баланс отрицательный");
        } else {
            this.balance = balance;
        }
    }

    @Override
    public AccountType getType() {
        return AccountType.SAVING;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "balance=" + balance +
                '}';
    }
}

package ua.spalah.bank.models.accounts;

/**
 * Created by Jerald_PC on 08.01.2017.
 */
public class CheckingAccount extends SavingAccount {

    private double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }

    @Override
    public AccountType getType() {

        return AccountType.CHECKING;
    }

    public double getOverdraft() {

        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "(" + "Type: " + getClass().getSimpleName() + " balance=" + getBalance() + " overdraft=" + overdraft + ")";
    }
}
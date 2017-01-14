package ua.spalah.bank.services.impl;

import ua.spalah.bank.exceptions.NotEnoughFundsException;
import ua.spalah.bank.models.accounts.Account;
import ua.spalah.bank.services.AccountService;

/**
 * Created by Jerald_PC on 09.01.2017.
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public void deposit(Account account, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be negative.");
        }
        account.setBalance(amount);
    }

    @Override
    public void withdraw(Account account, double amount)  {
        if (amount < 0)
            throw new IllegalArgumentException("Amount can't be negative.");
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            try {
                throw new NotEnoughFundsException(amount);
            } catch (NotEnoughFundsException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount)  {
        if (amount < 0)
            throw new IllegalArgumentException("Amount can't be negative.");

        if (fromAccount.getBalance() >= amount) {
            toAccount.setBalance(toAccount.getBalance() + amount);
            withdraw(fromAccount, amount);
        } else {
            try {
                throw new NotEnoughFundsException(amount);
            } catch (NotEnoughFundsException e) {
                e.printStackTrace();
            }
        }
    }
}

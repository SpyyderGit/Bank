package ua.spalah.bank.models;

import ua.spalah.bank.Gender;
import ua.spalah.bank.models.accounts.Account;

import java.util.ArrayList;

/**
 * Created by Jerald_PC on 08.01.2017.
 */


public class Client {
    private String name;
    private Account activeAcc;
    private Gender gender;

    private ArrayList<Account> listOfAcc = new ArrayList<>();

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void addAcc(Account acc) {
        if (activeAcc == null) {
            activeAcc = acc;
        }
        listOfAcc.add(acc);
    }


    public void setActiveAcc(Account activeAcc) {
        for (Account a : listOfAcc) {
            if (a.equals(activeAcc)) {
                this.activeAcc = activeAcc;
            } else {
                System.out.println("такого счета нету!!!");
            }
        }
    }

    public ArrayList<Account> getListOfAcc() {

        return listOfAcc;
    }

    @Override
    public String toString() {
        return "Client{" +
                "\nname='" + name + '\'' +
                "\nactiveAcc='" + activeAcc + '\'' +
                "\ngender=" + gender +
                "\nlistOfAcc=" + listOfAcc
                + "\n==========================================================\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return gender == client.gender;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}

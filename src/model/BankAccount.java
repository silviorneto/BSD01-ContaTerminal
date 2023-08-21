package model;

public class BankAccount {
    String agency;
    int account;
    double balance;

    Client client;

    public BankAccount(String agency, int account, double balance, Client client) {
        this.agency = agency;
        this.account = account;
        this.balance = balance;
        this.client = client;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void reduceBalance(double amount) {
        balance -= balance;
    }

    public double getBalance() {
        return balance;
    }
}

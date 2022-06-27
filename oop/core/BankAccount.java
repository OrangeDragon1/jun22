package oop.core;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(000000, 100, "default name", "default email", 91234567);
        System.out.println("Instantiating object.");
    }

    public BankAccount(int accountNumber, double balance, String name, String email, int phoneNumber) {
        System.out.println("Instantitating object with parameters.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    public BankAccount(String name, String email, int phoneNumber) {
        this(000000, 100, name, email, phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public void withdrawFunds(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }
}

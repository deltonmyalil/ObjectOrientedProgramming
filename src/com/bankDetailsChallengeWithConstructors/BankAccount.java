package com.bankDetailsChallengeWithConstructors;


// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

//defining constructor should not include void or static. Only include access specifier and the name of the class
    public BankAccount() {  // Constructor also supports Methoverloading as seen here
        //Optionally you can use some default values for such an initialization by using the special this()
        this(0,0,"DefaultName","default@default.com",0);
        //the above this() must be the first statement in the constructor body
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void withdrawFunds(int amount) {
        if (this.balance < amount)
            System.out.println("Insufficient Funds");
        else {
            this.balance -= amount;
            System.out.println("Deducted INR" + amount + " from " + this.customerName + "\'s account");
        }
    }

    public void depositFunds(int amount) {
        this.balance += amount;
        System.out.println("Credited INR" + amount + " to " + this.customerName + "\'s account");
    }
}

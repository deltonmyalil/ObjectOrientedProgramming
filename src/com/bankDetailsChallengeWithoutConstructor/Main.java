package com.bankDetailsChallengeWithoutConstructor;

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
public class Main {
    public static void main(String[] args) {
        BankAccount delton = new BankAccount(); //init delton bankacount using new
        BankAccount anphi = new BankAccount();
        delton.setAccountNumber(6361);
        delton.setBalance(1000);
        delton.setCustomerName("Delton M Antony");
        delton.setEmail("delton@example.com");
        delton.setPhoneNumber(2229990);

        System.out.println(delton.getCustomerName() + " holding account number " + delton.getAccountNumber() + " has a balance of INR" + delton.getBalance());
        delton.depositFunds(2000);
        delton.withdrawFunds(10000);
        System.out.println(delton.getCustomerName() + " holding account number " + delton.getAccountNumber() + " has a balance of INR" + delton.getBalance());
    }
}

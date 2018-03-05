package com.bankDetailsChallengeWithConstructors;

//Using constructor

public class Main {
    public static void main(String[] args) {
        // init without constructor for delton
        BankAccount delton = new BankAccount(); //init delton bankacount using new
        //actually here alse, the default empty constructor is called first. Then that default one will call the
        //initialized one using this()
        //that is why :empty constructor called" is printed in all the three of the cases
        delton.setAccountNumber(6361);
        delton.setBalance(1000);
        delton.setCustomerName("Delton M Antony");
        delton.setEmail("delton@example.com");
        delton.setPhoneNumber(2229990);

        System.out.println(delton.getCustomerName() + " holding account number " + delton.getAccountNumber() + " has a balance of INR" + delton.getBalance());
        delton.depositFunds(2000);
        delton.withdrawFunds(10000);
        System.out.println(delton.getCustomerName() + " holding account number " + delton.getAccountNumber() + " has a balance of INR" + delton.getBalance());

        // init using constructor for anphi
        BankAccount anphi = new BankAccount(4543,300,"Anphi","anphi@example.com",9754876);

        System.out.println("\nfor anphi now, using constructor");
        anphi.depositFunds(3000);
        anphi.withdrawFunds(500);
        System.out.println(anphi.getCustomerName() + " holding account number " + anphi.getAccountNumber() + " has a balance of INR" + anphi.getBalance());

        // init using empty constructor for antony
        BankAccount antony = new BankAccount();
        System.out.println("\nfor antony now, using empty constructor");
        System.out.println(antony.getCustomerName() + " holding account number " + antony.getAccountNumber() + " has a balance of INR" + antony.getBalance());
    }
}

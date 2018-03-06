package com.vipCustomerChallenge;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class Main {
    public static void main(String[] args) {
        VipCustomer delton = new VipCustomer();
        System.out.println(delton.getName());
        System.out.println(delton.getCreditLimit());
        System.out.println(delton.getEmail());

        VipCustomer anphi = new VipCustomer("Anphi Myalil", 465);
        System.out.println(anphi.getName());
        System.out.println(anphi.getCreditLimit());
        System.out.println(anphi.getEmail());

        VipCustomer delphi = new VipCustomer("Delphy Myalil", 47685, "maryvalentine@gmail.com");
        System.out.println(delphi.getName());
        System.out.println(delphi.getCreditLimit());
        System.out.println(delphi.getEmail());
    }
}
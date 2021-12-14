package com.company;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "087-222-222");


//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(100);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmailAdress("myemail@bob.com");
//        bobsAccount.setPhoneNumber(" (087) 1212 2121");

        bobsAccount.deposit(120);
        bobsAccount.whitdrawal(100);
        bobsAccount.deposit(150);

    }
}

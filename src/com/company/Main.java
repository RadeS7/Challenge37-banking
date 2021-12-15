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

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 1000, "adress");
        System.out.println(person3.getName());
    }


}

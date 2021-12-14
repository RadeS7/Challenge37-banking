package com.company;



public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailAdress;
    private String phoneNumber;

    public Account (){
        System.out.println("Empty constructor called");
    }
    public Account (String accountNumber, double balance, String customerName, String emailAdress, String phoneNumber){
        System.out.println();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;

    }

    public void deposit (double depositAmmount){
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + " made. New balance is " + balance);
    }
    public void whitdrawal (double whithdrawalAmount) {
        if (balance - whithdrawalAmount <0) {
            System.out.println("Only " + balance + " available. Whitdrawal not processed");
        }else {
            balance -=whithdrawalAmount;
            System.out.println("Whitdrawal of " + whithdrawalAmount + " completed. Remaining balance is " + balance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


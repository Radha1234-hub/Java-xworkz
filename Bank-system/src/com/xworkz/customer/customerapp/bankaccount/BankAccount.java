package com.xworkz.customer.customerapp.bankaccount;


public class BankAccount {

    public int accountId;
    public String typeOfAccount;
    public String branch;
    public double balance;

    public void displayBankAccountInfo() {
        System.out.println("Bank Account ID: " + accountId);
        System.out.println("Type of Account: " + typeOfAccount);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
    }
}


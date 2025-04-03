package com.xworkz.customer;


import com.xworkz.customer.customerapp.*;
import com.xworkz.customer.customerapp.bankaccount.BankAccount;
import com.xworkz.customer.customerapp.customer.Customer;

public class CustomerRunner {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.customerId = 1;
        customer1.customerName = "Ramesh";
        customer1.location = "Bangalore";

        BankAccount bankAccounts[] = new BankAccount[2];

        // Bank Account 1
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountId = 101;
        bankAccount1.typeOfAccount = "Savings";
        bankAccount1.branch = "Jayanagar";
        bankAccount1.balance = 50000.00;

        // Bank Account 2
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountId = 102;
        bankAccount2.typeOfAccount = "Current";
        bankAccount2.branch = "Rajajinagar";
        bankAccount2.balance = 75000.00;

        bankAccounts[0] = bankAccount1;
        bankAccounts[1] = bankAccount2;

        customer1.bankAccounts = bankAccounts;

        customer1.displayCustomerInfo();
    }
}

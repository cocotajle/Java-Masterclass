package com.natjavaudemy;

public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("Bank Central Asia");
        bank.addBranch("Kuta");
        bank.addCustomer("Kuta", "Theodor",500.50);
        bank.addCustomer("Kuta", "Michelle",2400.50);
        bank.addCustomer("Kuta", "Jack",1000.50);

        bank.addBranch("Jibmaran");
        bank.addCustomer("Jibmaran", "Jolene",2000.50);
        bank.addCustomer("Jibmaran", "Alex",400.50);
        bank.addCustomer("Jibmaran", "Suzane",24.50);

        bank.addCustomerTransaction("Kuta","Jack", 250.0);
        bank.addCustomerTransaction("Kuta","Jack", 100.0);
        bank.addCustomerTransaction("Kuta","Michelle", 1000.0);

        bank.

    }
}

package com.natjavaudemy;

        import java.util.ArrayList;
        import java.util.Scanner;

public class Customer {
    public Scanner scanner = new Scanner(System.in);
    private String nameCustomer;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String nameCustomer, double initialAmount) {
        this.nameCustomer = nameCustomer;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction (double amount){
        this.transactions.add(amount);
    }

    public String getName(){
return nameCustomer;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

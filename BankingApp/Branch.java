package com.natjavaudemy;

import java.util.ArrayList;

public class Branch {

    private String nameBranch;
    private ArrayList<Customer> customers;

    public Branch(String nameBranch, ArrayList<Customer> customers) {
        this.nameBranch = nameBranch;
        this.customers = customers;
    }

    public boolean newCustomer (String customerName , double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer == null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName){
        for(int i = 0; i<this.customers.size();i++){
            Customer chceckedCustomer = findCustomer(customerName);
            if (chceckedCustomer.getName().equals(customerName)){
                return chceckedCustomer;
            }
        }
        return null;
    }
}

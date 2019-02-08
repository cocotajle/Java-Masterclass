package com.natjavaudemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactList {
    private static Scanner scanner = new Scanner(System.in);

    private ArrayList<String> contactList = new ArrayList<String>();

    public void addConact(String contact) {

        if(contactList.contains(contact)){
            System.out.println("This contact is already exist.");
        }else{
            contactList.add(contact);
        }
    }

    public void printContact() {
        System.out.println("You have  " + contactList.size() + " in your book contact.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1) + " "+ contactList.get(i));
        }

    }

    public void modifyContact(String list) {
        System.out.println("Write name of old contact: ");
        String oldItem = scanner.nextLine();
        System.out.println("Write name of new contact: ");
        String newVItem = scanner.nextLine();
        Collections.replaceAll(contactList, oldItem, newVItem);
        System.out.println("replaceAll: " + list);

    }

    public void removeContact(int removeItemPosition) {
        String theItem = contactList.get((removeItemPosition));
        contactList.remove(removeItemPosition);
    }

    public String findContact(String findItem) {
        int removeItemPosition = contactList.indexOf(findItem);
        if (removeItemPosition >= 0) {
            return contactList.get(removeItemPosition);
        }
        return null;
    }

}

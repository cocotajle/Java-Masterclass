package com.natjavaudemy;

import java.util.Scanner;

public class MobilePhone {
    private static ContactList contactList = new ContactList();
    private static Scanner scanner = new Scanner(System.in);
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update contact.");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void runPhone(){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactList.printContact();
                    break;
                case 2:
                    contactList.addConact(scanner.nextLine());
                    break;
                case 3:
                    contactList.modifyContact(scanner.nextLine());
                    break;
                case 4:
                    contactList.removeContact(scanner.nextInt());
                    break;
                case 5:
                    contactList.findContact(scanner.nextLine());
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }


}

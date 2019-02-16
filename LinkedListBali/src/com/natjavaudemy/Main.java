package com.natjavaudemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit, "Munggu");
        addInOrder(placeToVisit, "Ubud");
        addInOrder(placeToVisit, "Canggu");
        addInOrder(placeToVisit, "Denpasar");
        addInOrder(placeToVisit, "Kuta");
        addInOrder(placeToVisit, "Tabanan");
        addInOrder(placeToVisit, "Amed");
        printList(placeToVisit);
        addInOrder(placeToVisit, "Sanur");
        printList(placeToVisit);

        visit(placeToVisit);

/*
        placeToVisit.add("Ubud");
        placeToVisit.add("Amed");
        placeToVisit.add("Sanur");
        placeToVisit.add("Denpasar");
        placeToVisit.add("Kuta");
        placeToVisit.add("Nusa Dua");
        placeToVisit.add("Jibmaran");

        printList(placeToVisit);
        placeToVisit.add("Canggu");
        placeToVisit.remove(4);*/
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());

        }
        System.out.println("End of trip.");
        System.out.println("\n");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0) {
                //equal, do not add
                System.out.println(newCity + " is already on your list.");
                return false;
            } else if (comparision > 0) {
                //new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                //move on next city

            }


        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in list.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;
                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("This is the end of the list.");
                    }
                    break;
                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("This is the start of te list.");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to quit" +
                "\n1 - go to next city" +
                "\n2 - go tu previoous city" +
                "\n3 - print menu");
    }
}

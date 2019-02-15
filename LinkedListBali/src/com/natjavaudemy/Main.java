package com.natjavaudemy;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> placeToVisit = new LinkedList<String>();

        placeToVisit.add("Ubud");
        placeToVisit.add("Amed");
        placeToVisit.add("Sanur");
        placeToVisit.add("Denpasar");
        placeToVisit.add("Kuta");
        placeToVisit.add("Nusa Dua");
        placeToVisit.add("Jibmaran");

        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());

        }
        System.out.println("End of trip.");

    }
}

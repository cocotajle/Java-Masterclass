import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

LinkedList<String> songToPlay = new LinkedList<String>();
play(songToPlay);

    }

    private static void printMenu() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println(
                "0 - to quit" +
                        "\n1 - skip forward to next song" +
                        "\n2 - skip backwards to previous song" +
                        "\n3 - replay current song" +
                        "\n4 - print menu");
    }
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now playing " + i.next());

        }
        System.out.println("End of playlist.");
        System.out.println("\n");

    }

    private static void play(LinkedList song) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = song.listIterator();

        if (song.isEmpty()) {
            System.out.println("No songs in list.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("This is the end of the list.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("This is the start of te list.");
                        goingForward = false;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }
}

package com.natjavaudemy;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Red Flag", "Billy Talent");
        album.addSong("Devil in the mindmass", 3.12);
        album.addSong("Red Flag", 3.03);
        album.addSong("Fallen leaves", 3.33);
        album.addSong("Where is the line?", 2.55);
        album.addSong("Surrender", 3.23);
        album.addSong("Bad World", 4.01);
        album.addSong("Devil's", 2.33);
        albums.add(album);

        album = new Album("Master of puppets", "Metallica");
        album.addSong("Enter Sandmad", 4.45);
        album.addSong("Sad but true", 4.45);
        album.addSong("Holler than thou", 4.45);
        album.addSong("The unforgiven", 4.45);
        albums.add(album);


        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Fallen leaves", playlist);
        albums.get(0).addToPlaylist("Surrender", playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(1, playlist);


        play(playlist);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("There are not any songs on this playlist.");
        } else {
            System.out.println("Now is playing" + listIterator.next().toString());
        }
        while (!quit) {
            int userChoose = scanner.nextInt();
            switch (userChoose) {
                case 0:
                    quit = true;
                    System.out.println("Playlist is over.");
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing" + listIterator.next().toString());
                    } else {
                        System.out.println("We are on the end of the list.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are on start of the list.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at start of the list.");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the plalist.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }

        }

    }
    private static void printMenu(){
        System.out.println("Available actions : \n press");
        System.out.println("\n0 - to quit" +
                "\n1 - to play next song" +
                "\n2 - to play previous song" +
                "\n3 - to replay the current song" +
                "\n4- print list of songs in the playlist" +
                "\n5 - show me avaible actions.");
    }

    private static void printList (LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("-----------------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("-----------------------------------");
    }
}



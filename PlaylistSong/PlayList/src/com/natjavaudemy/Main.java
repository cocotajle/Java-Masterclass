package com.natjavaudemy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

private static void play(LinkedList<Song> playlist){
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;
        ListIterator listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("There are not any songs on this playlist.");
        }else{
            System.out.println("Now is playing" + listIterator.next().toString());
        }
        while (!quit){
            int userChoose = scanner.nextInt();
            switch (userChoose){
                case 0:
                    quit=true;
                    System.out.println("Playlist is over.");
                    break;
                case 1:
if(!forward){
    if (listIterator.hasNext()){
        listIterator.next();
    }
    forward = true;
}
            }

        }

    }
}



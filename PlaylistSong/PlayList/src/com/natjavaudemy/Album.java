package com.natjavaudemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumTitle;
    private String artistName;
    private ArrayList<Song> albumSongsList;

    public Album(String albumTitle, String artistName) {
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.albumSongsList = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.albumSongsList.add(new Song(title, duration));
            return true;
        }
        return false;
    }
/*    public Song finfSong(String title){
            for (int i = 0; i < this.albumSongsList.size(); i++) {
                Song checkedSong = this.albumSongsList.get(i);
                if (checkedSong.getSongTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;*/

    private Song findSong(String title) {
        for (Song chceckedSong : this.albumSongsList) {
            if (chceckedSong.getSongTitle().equals(title)) {
                return chceckedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int tracknumber, LinkedList<Song> playList) {

        int index = tracknumber - 1;
       if ((index >= 00 && (index <= this.albumSongsList.size()))) {
            playList.add(this.albumSongsList.get(index));
            return true;
        }
        System.out.println("This album does not have a track");
        return false;
    }

    public boolean addToPlaylist(String titile, LinkedList<Song> playlist) {
        Song chceckedSong = findSong(titile);
        if (chceckedSong != null) {
            playlist.add(chceckedSong);
            return true;
        }
        System.out.println("This song " + titile + " is not in this album.");
        return false;
    }


}

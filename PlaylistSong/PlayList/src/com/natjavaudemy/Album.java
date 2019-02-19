package com.natjavaudemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumTitle;
    private String artistName
    private ArrayList<Song> albumSongsList;

    public Album(String albumTitle, String artistName) {
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.albumSongsList = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        if (finfSong(title) == null){
            this.albumSongsList.add(new Song(title,duration));
            return true;
        }return false;
    }
    public Song finfSong(String title){
            for (int i = 0; i < this.albumSongsList.size(); i++) {
                Song checkedSong = this.albumSongsList.get(i);
                if (checkedSong.getSongTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
    }



}

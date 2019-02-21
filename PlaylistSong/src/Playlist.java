import java.util.LinkedList;

public class Playlist {

    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new LinkedList<Song>();
    }

    private String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSongPlaylist(Album titleAlbum, String titleSong){
        if(!titleAlbum.isSong(titleSong)){
            System.out.println("Song can be find.");
            return false;
        }
        else if (titleAlbum.equals(titleSong)){
            System.out.println("The song " + titleSong + " has been added to " + getName());

            return true;

        }else {
            System.out.println("The song is already in the " + getName());
            return false;

        }
    }
}

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

private String albumName;
private String artistName;
private ArrayList<Song> songs;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public  Song findSong(String songName){
                for(Song chceckedSong : this.songs){
            if(chceckedSong.getSongName().equals(songName)){
                return chceckedSong;
            }
        }return null;
    }

    public boolean addToPlaylist(String songName, LinkedList<Song>playlist){
        So chceckedSong = findSong(songName);
        if(chceckedSong != null){
            playlist.add(chceckedSong);
            return true;
        }
        System.out.println("This song is not in this album.");
        return false;
    }
}

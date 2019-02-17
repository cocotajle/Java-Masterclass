import java.util.LinkedList;

public class Playlist {

    private LinkedList<String> playlistSong;

    public Playlist(LinkedList<String> playlistSong) {
        this.playlistSong = playlistSong;
    }

    public LinkedList<String> getPlaylistSong() {
        return playlistSong;
    }
}

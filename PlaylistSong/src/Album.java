import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<SongClass> songs;

    public Album(String name, LinkedList<SongClass> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public LinkedList<SongClass> getSongs() {
        return songs;
    }
}

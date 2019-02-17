import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<Song> songs;

    public Album(String name, LinkedList<Song> songs) {
        this.name = name;
        songs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, String duration) {
        if (!isSong(title)) {
            songs.add(new Song(title,duration));
            System.out.println("Added " + name + " into " + getName());
            return true;
        }
        System.out.println("Song " + name + " is already in the album " + getName());
        return false;


        }
    public boolean isSong(String title){
        for (int i = 0; i < songs.size(); i++) {
            if (title.equals(songs.get(i).getTitle()))
                return true;
        }
        return false;
    }
}
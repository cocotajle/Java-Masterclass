import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<SongClass> songs;

    public Album(String name, LinkedList<SongClass> songs) {
        this.name = name;
        songs = new LinkedList<SongClass>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<SongClass> getSongs() {
        return songs;
    }

    public boolean addSong(String name, String duration) {
        if (!isSong(name)) {
            songs.add(new Song(name, duration));
            System.out.println("Added " + name + " into " + getName());
            return true;
        }
        System.out.println("Song " + name + " is already in the album " + getName());
        return false;

        public boolean isSong(String name){
            for (int i = 0; i < songs.size(); i++) {
                if (name.equals(songs.get(i).getTitle()))
                    return true;
            }
            return false;
        }
    }
}
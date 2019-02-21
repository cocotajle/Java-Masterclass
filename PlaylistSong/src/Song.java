public class Song {
private String songName;
private double songDuraation;

    public Song(String songName, double songDuraation) {
        this.songName = songName;
        this.songDuraation = songDuraation;
    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuraation() {
        return songDuraation;
    }

    @Override
    public String toString() {
        return this.songName + this.songDuraation;
    }
}

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> playlist = new ArrayList<Song>();

    public void addSong(Song addThisSong) {

        playlist.add(addThisSong);

    }

    public boolean removeSong(Song removeThisSong) {

        return playlist.remove(removeThisSong);

    }

    public Song getSong(int index) {

        return playlist.get(index);

    }

    public String toString() {

        String s = "";

        for(int i = 0; i < playlist.size(); i++)
            s += (i + 1) + (((i + 1) < 10) ? ".  " : ". ") + playlist.get(i).toString() + "\n";

        return s;

    }

    public int getSize() {

        return playlist.size();

    }
    
}
public class Song {

    private String name = "", artist = "", genre = "";
    
    public Song(String _name, String _artist, String _genre) {

        name = _name;
        artist = _artist;
        genre = _genre;

    }

    public String getName() {

        return name;

    }

    public String getArtist() {

        return artist;

    }

    public String getGenre() {

        return genre;

    }

    public String toString() {

        String s = "";

        s += name;

        for(int i = 0; i < 50 - name.length(); i++)
            s += " ";

        s += artist;

        for(int i = 0; i < 50 - artist.length(); i++)
            s += " ";

        s += genre;

        return s;

    }

}
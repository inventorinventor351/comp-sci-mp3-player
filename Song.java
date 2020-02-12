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

        return name + "     " + artist + "     " + genre;

    }

}
//javac -Werror -Xlint mp3Driver.java
//java mp3Driver

import java.util.ArrayList;
import java.util.Random;

public class MP3Driver {

    public static Playlist shuffle(Playlist P) {

        int originalSize = P.getSize();
        Playlist p = new Playlist();
        Random rand = new Random();
        int num = rand.nextInt(P.getSize());
        String lastArtist = "";

        p.addSong(P.getSong(num));
        lastArtist = P.getSong(num).getArtist();
        P.removeSong(P.getSong(num));

        for(int i = 0; i < originalSize; i++) {

            if(P.getSize() < 1)
                break;
            
            if(rand.nextDouble() < 0.15) {

                ArrayList<Song> sameArtist = new ArrayList<Song>();

                for(int j = 0; j < P.getSize(); j++)
                    if(P.getSong(j).getArtist().equals(lastArtist))
                        sameArtist.add(P.getSong(j));

                if(sameArtist.size() > 0) {

                    num = rand.nextInt(sameArtist.size());

                    p.addSong(sameArtist.get(num));
                    lastArtist = sameArtist.get(num).getArtist();
                    P.removeSong(sameArtist.get(num));

                }

                else {

                    num = rand.nextInt(P.getSize());

                    p.addSong(P.getSong(num));
                    lastArtist = P.getSong(num).getArtist();
                    P.removeSong(P.getSong(num));

                }

            }

            else {

                num = rand.nextInt(P.getSize());

                p.addSong(P.getSong(num));
                lastArtist = P.getSong(num).getArtist();
                P.removeSong(P.getSong(num));

            }

        }

        return p;

    }

    public static void printList(Playlist p) {

        System.out.println(p.toString());

    }

    public static void printList(SongLib s) {

        System.out.println(s.toString());

    }

    public static void main(String[] args) {

        SongLib mySongLib = new SongLib();
        Playlist allRock = new Playlist(), allJazz = new Playlist(), allClassical = new Playlist();

        for(int i = 0; i < mySongLib.getSize(); i++) {

            if(mySongLib.getSong(i).getGenre().equalsIgnoreCase("rock"))
                allRock.addSong(mySongLib.getSong(i));

            else if(mySongLib.getSong(i).getGenre().equalsIgnoreCase("jazz"))
                allJazz.addSong(mySongLib.getSong(i));

            else if(mySongLib.getSong(i).getGenre().equalsIgnoreCase("classical"))
                allClassical.addSong(mySongLib.getSong(i));

        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("All Rock Playlist:\n");
        printList(allRock);
        System.out.println("All Jazz Playlist:\n");
        printList(allJazz);
        System.out.println("All Classical Playlist:\n");
        printList(allClassical);
        System.out.println("Song Library:\n");
        printList(mySongLib);
        System.out.println("Shuffled Rock Playlist:\n");
        allRock = shuffle(allRock);
        printList(allRock);
        System.out.println("Shuffled Jazz Playlist:\n");
        allJazz = shuffle(allJazz);
        printList(allJazz);
        System.out.println("Shuffled Classical Playlist:\n");
        allClassical = shuffle(allClassical);
        printList(allClassical);


    }

}
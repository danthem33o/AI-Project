package misc;

import java.util.Scanner;

/**
 * Created by Daniel on 03/12/2015.
 *
 * Song class.
 */

public class Song {
    int tempo, volume, playcount;
    SongType genre;


    /**
     * Array list needed for the .split() method in the
     * scanner class. All String values need to be saved
     * to an array.
     *
     * .split() reads as String, volume, tempo and playcount
     * are parsed to an Int.
     *
     * Values:
     * Tempo[0], volume[1], playcount[2], genre[3].
     *
     * @param values
     */
    public Song(String[] values){
        tempo = Integer.parseInt(values[0]);
        volume = Integer.parseInt(values[1]);
        playcount = Integer.parseInt(values[2]);
        genre = SongType.getSongType(values[3]);
    }

    //GETTERS
    public int getTempo() {
        return tempo;
    }

    public int getPlaycount() {
        return playcount;
    }

    public int getVolume() {
        return volume;
    }

    public SongType getGenre() {
        return genre;
    }

    //SETTERS
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPlaycount(int playcount) {
        this.playcount = playcount;
    }

    public void setGenre(SongType genre) {
        this.genre = genre;
    }
}//End class

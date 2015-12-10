package storage;

import misc.Song;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 03/12/2015.
 */
public class Storage {
    Scanner s;
    //Array list of songs to be added for both the temp and data set storage.
    //Dataset is retrieved through the use of the scanner class.
    //Data set - Songs

    //File chooser to open data sets
    ArrayList<Song> songs;




    public void readAndAdd(){
        while(s.hasNext()){
            String string = s.nextLine();
            String[] values = string.split(",");
            songs.add(new Song (values));
        }
    }
}//End class

package misc;

import java.util.Scanner;

/**
 * Created by Daniel on 03/12/2015.
 */
public class Scan {
    Scanner scanner;
    String fileLocation= "C:\\Users\\Daniel\\IdeaProjects\\AI_1.0\\datasets";

    public void temp(){
        while( scanner.hasNext()){
            String string = scanner.nextLine();
            String[] values = string.split(",");
            Song songs = new Song(values);
        }
    }

}


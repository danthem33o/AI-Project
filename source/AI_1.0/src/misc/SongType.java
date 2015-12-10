package misc;

/**
 * Created by Daniel on 03/12/2015.
 *
 * List provided from the wikipedia wepage:
 * https://en.wikipedia.org/wiki/List_of_popular_music_genres
 *
 * Some of the most popular genres.
 */
public enum SongType {
    NA,
    ROCK,
    JAZZ,
    POP,
    COUNTRY,
    DANCE,
    BLUES,
    ELECTRONIC,
    HIPHOP,
    FOLK;

    /**
     * getSongType()
     *
     * Checks if s belongs in SongType, else
     * it returns a value of NA. If type is
     * found, return type.
     *
     * @param s
     * @return
     */
    public static SongType getSongType(String s) {
        for (SongType type : SongType.values()) {
            if (s.equals(type.name())) {
                return type;
            }
        }
        return NA;
    }
}

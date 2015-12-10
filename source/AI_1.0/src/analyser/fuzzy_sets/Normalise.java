package analyser.fuzzy_sets;

import analyser.fuzzy_sets.data_sets.PlayCount;
import analyser.fuzzy_sets.data_sets.Tempo;
import analyser.fuzzy_sets.data_sets.Volume;

/**
 * Created by Daniel on 01/12/2015.
 */
public class Normalise {


    //If temp is within a specific range, set as that range
    //Text format - n
    //could AND OR for validity checker for matches on songs
    public String normaliseTempo(float t){
        String range = "";
        Tempo tempo = new Tempo();

        if (FuzzySets.EXTEND(tempo.m_t_slow(t))) range = "slow";
        else if(FuzzySets.EXTEND(tempo.m_t_moderate(t))) range = "Moderate";
        else if(FuzzySets.EXTEND(tempo.m_t_fast(t))) range = "fast";

        return range;
    }

    public String normaliseVolume(float t){
        String range = "";
        Volume volume = new Volume();

        if(FuzzySets.EXTEND(volume.m_v_low(t))) range = "slow";
        else if (FuzzySets.EXTEND(volume.m_v_medium(t))) range = "Moderate";
        else if (FuzzySets.EXTEND(volume.m_v_high(t))) range = "high";

        return range;
    }

    public String normalisePlayCount(float t){
        String range = "";
        PlayCount playCount = new PlayCount();

        if(FuzzySets.EXTEND(playCount.m_t_low(t))) range = "low";
        else if(FuzzySets.EXTEND(playCount.m_t_medium(t))) range = "medium";
        else if(FuzzySets.EXTEND(playCount.m_t_high(t))) range = "high";

        return range;
    }


}//end class

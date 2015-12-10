package analyser.fuzzy_sets.data_sets;

import analyser.fuzzy_sets.FuzzySets;

/**
 * Created by Daniel on 01/12/2015.
 */
public class PlayCount extends FuzzySets {

    //between 66-76
    public float m_t_low(float x){
        float left = 20;
        float right = 100;
        //less than or 66 = true else false
        if (x<=left) return 1;
        else if (x>=right)return 0;
        else return downslope(x, left, right);
    }

    public float m_t_high(float x){
        float left = 180;
        float right = 220;
        if(x<=left) return 0;
        else if (x>=right) return 1;
        else return upslope (x, left, right);
    }

    //108-120
    public float m_t_medium(float x){
        float leftB = 20;
        float leftM = 100;
        float rightM = 180;
        float rightB = 220;

        if (x<=leftB) return 0;

        else if ((x>leftB) && (x<leftM))
            return upslope(x, leftB, leftM);

        else if ((x>rightM) && (x<rightB))
            return downslope(x, rightM, rightB);

        else if (x>=rightB) return 0;

        else return 1;
    }

}

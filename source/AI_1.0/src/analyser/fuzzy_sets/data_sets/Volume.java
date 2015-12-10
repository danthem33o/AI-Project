package analyser.fuzzy_sets.data_sets;

/**
 * Created by Daniel on 01/12/2015.
 */

import analyser.fuzzy_sets.FuzzySets;

/**
 * @author Daniel Hutchinson
 * Student No: w12008573
 * Computer Science
 * CM0671: Artificial Intelligence
 *
 * Volume class (Dynamics).
 * Measurements taken from wikipedia.
 *
 * Low = pp(49-80)Medium = mf(80-96), Loud = ff(96-112)
 *
 */

public class Volume extends FuzzySets {


    //Membership functions
    public float m_v_low(float x){
        float left = 49;
        float right = 80;
        if(x<=left) return 1;
        else if(x>=right) return 0;
        else return downslope(x, left, right);
    }

    public float m_v_high(float x){
        float left = 96;
        float right = 112;
        if(x>=right) return 1;
        else if(x<left) return 0;
        else return upslope(x, left, right);
    }

    public float m_v_medium(float x){
        float leftB = 49;
        float leftM = 80;
        float rightM = 96;
        float rightB= 112;

        if(x<=leftB) return 0;

        else if((x>leftB) && (x<leftM))
            return downslope(x, leftB, leftM);

        else if((x>rightM) && (x<rightB))
            return upslope(x,rightM, rightB);

        else if(x<=rightB) return 0;

        else return 1;
    }

}//end class

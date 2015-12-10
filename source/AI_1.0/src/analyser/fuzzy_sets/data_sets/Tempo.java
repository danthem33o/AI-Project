package analyser.fuzzy_sets.data_sets;

import analyser.fuzzy_sets.FuzzySets;

/**
 * @author Daniel Hutchinson
 * Student No: w12008573
 * Computer Science
 * CM0671: Artificial Intelligence
 *
 * Membership class for tempo. Uses three values: slow, moderate and fast.
 * Values taken from wikipedia.
 * Tempos:
 * slow = 66-76, moderate 108-120, fast 120-168
 */

public class Tempo extends FuzzySets {

    //between 66-76

    /**
     * m_t_slow()
     *
     * Checks for membership in the slow
     * function variable.
     *
     * If x is <= left then x is a member
     * of slow; else if x >= right, then
     * x is not a member of slow; else
     * return the degree of membership of
     * x.
     *
     * Between values 76-108
     *
     * @param x
     * @return
     */
    public float m_t_slow(float x){
        float left = 76;
        float right = 108;
        //less than or 66 = true else false
        if (x<=left) return 1;
        else if (x>=right)return 0;
        else return downslope(x, left, right);
    }

    public float m_t_fast(float x){
        float left = 120;
        float right = 168;
        if(x<=left) return 0;
        else if (x>=right) return 1;
        else return upslope (x, left, right);
    }

    //108-120
    public float m_t_moderate(float x){
        float leftB = 76;
        float leftM = 108;
        float rightM = 120;
        float rightB = 168;

        if (x<=leftB) return 0;

        else if ((x>leftB) && (x<leftM))
            return upslope(x, leftB, leftM);

        else if ((x>rightM) && (x<rightB))
            return downslope(x, rightM, rightB);

        else if (x>=rightB) return 0;

        else return 1;
    }

}//end class

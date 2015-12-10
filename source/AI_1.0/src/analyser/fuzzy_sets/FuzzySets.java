package analyser.fuzzy_sets;

/**
 * Created by Daniel on 01/12/2015.
 */
public class FuzzySets {

    //extends class - deals with bool problem
    public static boolean EXTEND(double x)
    { return ((x < 0.5) ? false : true);}

    //fuzzy operators
    public static float f_and(float x, float y){
        if (x<y) return x;
        else return y;
    }

    public static float f_or(float x, float y){
        if (x<y) return y;
        else return x;
    }

    //Upslope & downslope
    public static float downslope(float x, float left, float right){
        return ((right-x)/(right-left));
    }

    public static float upslope(float x, float left, float right){
        return ((x-left)/(right-left));
    }

}

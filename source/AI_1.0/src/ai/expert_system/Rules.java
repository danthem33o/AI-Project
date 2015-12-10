package ai.expert_system;

/**
 * Created by Daniel on 06/12/2015.
 *
 *
 * -- Knowledge base
 */
public class Rules {
    boolean  matched;
    int      weight;

    String   antecedantA, antecedantB, consequent;

    public Rules() {
        matched = false;
        weight  = 0;
    }

    public void setRule(String antecedantA, String antecedantB, String consequent){
        this.antecedantA = antecedantA;
        this.antecedantB = antecedantB;
        this.consequent  = consequent;
    }

}//End class

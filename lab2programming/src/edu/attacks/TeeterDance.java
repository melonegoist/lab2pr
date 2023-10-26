package edu.attacks;
import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove{
    public TeeterDance(){
        super(Type.NORMAL, 0, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect.confuse(opp);
    }

    public String describe(){
        return "uses Teeter Dance";
    }

}

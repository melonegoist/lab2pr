package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {
    public ConfuseRay(){
        super(Type.GHOST, 0, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect.confuse(opp);
    }

    public void applySelfEffects(Pokemon ally){
        Effect eff = new Effect().chance(0.33).stat(Stat.HP, -40);
        ally.addEffect(eff);
    }

    public String describe(){
        return "uses Confuse Ray";
    }
}

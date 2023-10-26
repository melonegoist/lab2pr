package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect eff = new Effect().chance(0.1).condition(Status.PARALYZE);
        opp.addEffect(eff);
    }

    public String describe(){
        return "uses Thunderbolt";
    }
}

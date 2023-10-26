package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {
    public PoisonSting(){
        super(Type.POISON, 15, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect eff = new Effect().chance(0.3).condition(Status.POISON);
        opp.addEffect(eff);
    }

    public String describe(){
        return "uses Poison Sting";
    }
}

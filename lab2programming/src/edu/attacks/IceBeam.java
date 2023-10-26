package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect eff = new Effect().chance(0.9).condition(Status.FREEZE);
        opp.addEffect(eff);
    }

    public String describe(){
        return "uses Ice Beam";
    }
}

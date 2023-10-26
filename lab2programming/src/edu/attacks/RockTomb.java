package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60, 95);
    }

    public void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPEED, -1);
    }

    public String describe(){
        return "uses Rock Tomb";
    }
}

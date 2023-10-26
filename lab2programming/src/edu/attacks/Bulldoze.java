package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    public void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPEED, -1);
    }

    public String describe(){
        return "uses Bulldoze";
    }
}

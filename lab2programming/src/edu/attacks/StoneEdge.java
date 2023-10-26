package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK, 100, 80);
    }
    public double calcCriticalHit(Pokemon ally, Pokemon opp){
        return super.calcCriticalHit(ally, opp)*3;
    }

    public String describe(){
        return "uses StoneEdge";
    }

}

package edu.attacks;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    public String describe(){
        return "uses Rock Slide";
    }

    public void applyOppEffects(Pokemon opp){
        Effect.flinch(opp);
    }

    public boolean checkAccuracy(Pokemon ally, Pokemon opp){
        return true;
    }
}

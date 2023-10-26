package edu.attacks;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam(){
        super(Type.PSYCHIC, 65, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Effect.confuse(opp);
    }

    public String describe(){
        return "uses Psybeam";
    }
}

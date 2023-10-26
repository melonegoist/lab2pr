package edu.attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Crunch extends PhysicalMove {
    public Crunch(){
        super(Type.DARK, 80, 100);
    }

    public void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.DEFENSE, -1);
    }

    public String describe(){
        return "uses Crunch";
    }
}

package edu.attacks;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    public void applyOppEffects(Pokemon opp){
        Status condition = opp.getCondition();

        if (condition.equals(Status.BURN) || condition.equals(Status.POISON) || condition.equals(Status.PARALYZE)){
            opp.setMod(Stat.HP, (-3)*2);
        }
        else{
            opp.setMod(Stat.HP, -3);
        }
    }

    public String describe(){
        return "uses Facade";
    }
}

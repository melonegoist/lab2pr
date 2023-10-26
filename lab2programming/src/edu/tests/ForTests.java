package edu.tests;
import ru.ifmo.se.pokemon.*;
public class ForTests {
    public Battle battle = new Battle();
    Pokemon Pally;
    Pokemon Popp;

    Pokemon[] PallyL;
    Pokemon[] PoppL;

    boolean test_state = true;

    public ForTests(Pokemon ally, Pokemon opp){
        Pally = ally;
        Popp = opp;
    }

    public ForTests(Pokemon[] ally, Pokemon[] opp){
        PallyL = ally;
        PoppL = opp;
        test_state = false;
    }

    public void Start(){
        battle.addAlly(Pally);
        battle.addFoe(Popp);

        if (test_state){
            battle.addAlly(Pally);
            battle.addFoe(Popp);
        }

        else{
            for (Pokemon pok: PallyL){
                battle.addAlly(pok);
            }

            for (Pokemon pokopp: PoppL){
                battle.addFoe(pokopp);
            }
        }

        battle.go();
    }
}

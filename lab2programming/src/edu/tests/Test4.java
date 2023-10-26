package edu.tests;

import edu.pokemons.Throh;
import ru.ifmo.se.pokemon.Battle;

public class Test4 {
    public static void main(String[] args){
        Battle battle = new Battle();

        Throh p1 = new Throh("t1", 1);
        Throh p2 = new Throh("t2", 1);

        battle.addAlly(p1);
        battle.addFoe(p2);

        battle.go();
    }
}

package edu.tests;

import edu.pokemons.Grumpig;
import edu.pokemons.Throh;
import ru.ifmo.se.pokemon.*;

public class Test3 {
    public static void main(String[] args){
        Battle battle = new Battle();

        Grumpig p1 = new Grumpig("Grumpig", 3);

        Throh p2 = new Throh("Throh", 1);

        battle.addAlly(p2);
        battle.addFoe(p1);

        battle.go();
    }
}

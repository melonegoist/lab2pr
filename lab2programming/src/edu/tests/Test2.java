package edu.tests;

import edu.pokemons.Throh;
import ru.ifmo.se.pokemon.*;
public class Test2 {
    public static void main(String[] args){
        Battle battle = new Battle();

        Throh p1 = new Throh("big_throh", 1);
        Pokemon p2 = new Pokemon("NotThroh", 1);

        battle.addAlly(p1);
        battle.addFoe(p2);

        battle.go();
    }
}

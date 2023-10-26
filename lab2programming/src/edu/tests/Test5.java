package edu.tests;

import edu.pokemons.Spoink;

public class Test5 {
    public static void main(String[] args){
        Spoink p1 = new Spoink("s1", 1);
        Spoink p2 = new Spoink("s2", 1);

        ForTests battle = new ForTests(p1, p2);

        battle.Start();
    }
}

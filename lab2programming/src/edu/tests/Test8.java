package edu.tests;

import edu.pokemons.TestP;

public class Test8 {
    public static void main(String[] args){
        TestP p1 = new TestP("n1", 1);
        TestP p2 = new TestP("n2", 1);

        ForTests battle = new ForTests(p1, p2);

        battle.Start();
    }
}

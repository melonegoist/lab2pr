package edu.tests;

import edu.pokemons.NidoQueen;

public class Test7 {
    public static void main(String[] args){
        NidoQueen p1 = new NidoQueen("n1", 1);
        NidoQueen p2 = new NidoQueen("n2", 1);

        ForTests battle = new ForTests(p1, p2);

        battle.Start();
    }
}

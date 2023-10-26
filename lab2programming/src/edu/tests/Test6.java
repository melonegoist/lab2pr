package edu.tests;

import edu.pokemons.NidoQueen;
import edu.pokemons.Nidorina;

public class Test6 {
    public static void main(String[] args){
        NidoQueen p1 = new NidoQueen("n1", 1);
        Nidorina p2 = new Nidorina("n2", 1);
        ForTests battle = new ForTests(p1, p2);
        battle.Start();
    }
}

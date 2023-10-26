package edu.pokemons;

import edu.attacks.Crunch;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int level){
        super(name, level);

        Crunch extraAttk = new Crunch();
        setStats(70, 62, 67, 55, 55, 56);
        addMove(extraAttk);
    }
}

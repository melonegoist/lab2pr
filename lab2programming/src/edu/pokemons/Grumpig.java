package edu.pokemons;
import edu.attacks.TeeterDance;

public class Grumpig extends Spoink {
    public Grumpig(String name, int level){
        super(name, level);
        TeeterDance extraAttk = new TeeterDance();

        setStats(80, 45, 65, 90, 110, 80);
        addMove(extraAttk);
    }
}

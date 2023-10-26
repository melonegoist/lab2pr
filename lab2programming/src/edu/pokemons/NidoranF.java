package edu.pokemons;

import edu.attacks.IceBeam;
import edu.attacks.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {
    public NidoranF(String name, int level){
        super(name, level);

        IceBeam attk1 = new IceBeam();
        PoisonSting attk2 = new PoisonSting();

        setStats(55, 47, 52, 40, 40, 41);
        setType(Type.POISON);
        setMove(attk1, attk2);
    }
}

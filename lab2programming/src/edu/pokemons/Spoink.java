package edu.pokemons;

import edu.attacks.ConfuseRay;
import edu.attacks.Facade;
import edu.attacks.Psybeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spoink extends Pokemon {
    public Spoink(String name, int level){
        super(name, level);

        Facade attk1 = new Facade();
        Psybeam attk2 = new Psybeam();
        ConfuseRay attk3 = new ConfuseRay();

        setType(Type.PSYCHIC);
        setStats(60, 25, 35, 70, 80, 60);
        setMove(attk1, attk2, attk3);
    }
}

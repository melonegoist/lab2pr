package edu.pokemons;

import edu.attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class TestP extends Pokemon {
    Thunderbolt attk = new Thunderbolt();
    public TestP(String name, int level){
        super(name, level);

        setStats(10, 10, 10, 10, 10, 10);
        setMove(attk);
        setType(Type.POISON);
    }
}

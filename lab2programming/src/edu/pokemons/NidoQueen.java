package edu.pokemons;

import edu.attacks.Thunderbolt;
import ru.ifmo.se.pokemon.*;

public class NidoQueen extends Nidorina {
    public NidoQueen(String name, int level){
        super(name, level);

        Thunderbolt extraAttk = new Thunderbolt();

        setStats(90, 92, 87, 75, 85, 76);
        setType(Type.GROUND);
        addMove(extraAttk);
    }
}

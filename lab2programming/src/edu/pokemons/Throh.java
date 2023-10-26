package edu.pokemons;
import edu.attacks.Bulldoze;
import edu.attacks.RockTomb;
import edu.attacks.StoneEdge;
import ru.ifmo.se.pokemon.*;
import edu.attacks.RockSlide;
public class Throh extends Pokemon{
    public Throh(String name, int level){
        super(name, level);

        RockSlide attk1 = new RockSlide();
        RockTomb attk2 = new RockTomb();
        StoneEdge attk3 = new StoneEdge();
        Bulldoze attk4 = new Bulldoze();

        setType(Type.FIGHTING);
        setStats(120, 100, 85, 30, 85, 45);
        setMove(attk1, attk2, attk3, attk4);
    }
}


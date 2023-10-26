import edu.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();

        Throh p1 = new Throh("Throh", 1);
        Spoink p2 = new Spoink("Spoink", 1);
        Nidorina p3 = new Nidorina("Nidorina", 1);
        NidoranF p4 = new NidoranF("NidoranF", 1);
        NidoQueen p5 = new NidoQueen("NidoQueen", 1);
        Grumpig p6 = new Grumpig("Grumpig", 1);

        battle.addAlly(p1);
        battle.addAlly(p3);
        battle.addAlly(p5);

        battle.addFoe(p2);
        battle.addFoe(p4);
        battle.addFoe(p6);

        battle.go();
    }
}

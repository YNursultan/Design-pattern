package kz.index.characters;

import kz.index.CantFly;
import kz.index.FantasyCharacters;
import kz.index.ItWalk;

public class Orcs extends FantasyCharacters {


    public Orcs(String name, int age, int level) {
        super(name, age, level);

        walkingType = new ItWalk();
        flyingType = new CantFly();
    }
}

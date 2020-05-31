package kz.index.characters;

import kz.index.FantasyCharacters;
import kz.index.ItFly;
import kz.index.ItWalk;

public class Vampire extends FantasyCharacters {


    public Vampire(String name, int age, int level) {
        super(name, age, level);

        walkingType = new ItWalk();
        flyingType = new ItFly();
    }
}

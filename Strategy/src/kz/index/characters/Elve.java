package kz.index.characters;

import kz.index.FantasyCharacters;
import kz.index.FlyMagic;
import kz.index.ItWalk;

public class Elve extends FantasyCharacters {
    public Elve(String name, int age, int level) {
        super(name, age, level);

        walkingType = new ItWalk();
        flyingType = new FlyMagic();
    }
}

package kz.index.characters;

import kz.index.CantWalk;
import kz.index.FantasyCharacters;
import kz.index.ItFly;

public class Bat extends FantasyCharacters {
    public Bat(String name, int age, int level) {
        super(name, age, level);

        walkingType = new CantWalk();
        flyingType = new ItFly();
    }
}

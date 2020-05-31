package kz.index;

import kz.index.characters.Elve;
import kz.index.characters.Human;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Elve elve = new Elve("Ardagon",250,360);
        Human human = new Human("John",32,250);

        System.out.println(elve.tryToFly());
        System.out.println(elve.tryToWalk());
    }
}

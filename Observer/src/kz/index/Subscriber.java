package kz.index;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> PaperAndMagazines) {
        System.out.println("Dear " + name + "\nWe have some papers and magazines\n" + PaperAndMagazines
                + "\n-----------------------------------\n");
    }
}

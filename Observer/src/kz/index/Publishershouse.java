package kz.index;

import java.util.ArrayList;
import java.util.List;

public class Publishershouse implements Observed {

    List<String> PapersAndMagazines = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();

    public void addPapersAndMagazines (String PapersAndMagazines){
        this.PapersAndMagazines.add(PapersAndMagazines);
        notifyObservers();
    }

    public void removePapersAndMagazines (String PapersAndMagazines){
        this.PapersAndMagazines.remove(PapersAndMagazines);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribes){
            observer.handleEvent(this.PapersAndMagazines);
        }

    }
}

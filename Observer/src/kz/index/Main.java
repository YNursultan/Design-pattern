package kz.index;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Publishershouse PostalOffice = new Publishershouse();

        PostalOffice.addPapersAndMagazines("BBC");
        PostalOffice.addPapersAndMagazines("News");

        Observer firstSubscriber = new Subscriber("Tom");
        Observer secondSubscriber = new Subscriber("John");

        PostalOffice.addObserver(firstSubscriber);
        PostalOffice.addObserver(secondSubscriber);

        PostalOffice.addPapersAndMagazines("Comics");

    }
}

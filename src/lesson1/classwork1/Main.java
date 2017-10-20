package lesson1.classwork1;

public class Main {
    public static void main(String[] args) {

        TravelBook travelBook = new TravelBook();
        FantasyBook fantasyBook = new FantasyBook();

        FantasyBook interestingFantasyBook = new InterestingFantasyBook();
        FantasyBook boringFantasyBook = new BoringFantasyBook();

        travelBook.setS2("TravelBook");
        System.out.println(travelBook.getS2());
        travelBook.buyTheBook();
        travelBook.readTheBook();

        fantasyBook.setS1("FantasyBook");
        System.out.println(fantasyBook.getS1());
        fantasyBook.buyTheBook();
        fantasyBook.readTheBook();

        interestingFantasyBook.setS1("InterestingFantasyBook");
        System.out.println(interestingFantasyBook.getS1());

        boringFantasyBook.setS1("BoringFantasyBook");
        System.out.println(boringFantasyBook.getS1());
    }
}

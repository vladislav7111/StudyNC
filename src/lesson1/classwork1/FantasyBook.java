package lesson1.classwork1;

public class FantasyBook extends Book implements BuyTheBook {
    private String s1;

    public FantasyBook() {
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    @Override
    void readTheBook() {
        System.out.println("Read FantasyBook.");
    }

    @Override
    public void buyTheBook() {
        System.out.println("Buy the FantasyBook.");
    }
}
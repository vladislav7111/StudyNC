package lesson1.classwork1;

public class TravelBook extends Book implements BuyTheBook {
    private String s2;

    public TravelBook() {
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Override
    void readTheBook() {
        System.out.println("Read TravelBook.");
    }

    @Override
    public void buyTheBook() {
        System.out.println("Buy the TravelBook.");
    }
}

package lesson1.classwork1;

public class BoringFantasyBook extends FantasyBook {

    private String s4;

    public BoringFantasyBook() {
    }
    @Override
    public String getS1() {
        return s4;
    }
    @Override
    public void setS1(String s4) {
        this.s4 = s4;
    }

    @Override
    void readTheBook() {
        System.out.println("Read BoringFantasyBook.");
    }
}
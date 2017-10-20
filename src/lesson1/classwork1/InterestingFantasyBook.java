package lesson1.classwork1;

public class InterestingFantasyBook extends FantasyBook {
    private String s3;

    public InterestingFantasyBook() {
    }
    @Override
    public String getS1() {
        return s3;
    }
    @Override
    public void setS1(String s3) {
        this.s3 = s3;
    }

    @Override
    void readTheBook() {
        System.out.println("Read InterestingFantasyBook.");
    }
}

package tutorial.example.day7;

public class Bird extends Animal {
    private String wings;

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    @Override
    public void move() {
        // birds can fly in the sky....
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }
}

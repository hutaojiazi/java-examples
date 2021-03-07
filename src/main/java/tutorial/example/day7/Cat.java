package tutorial.example.day7;

public class Cat extends Animal {
    private String legs;

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void move() {
        // how cats actually move, seems cats have four legs and they can run
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

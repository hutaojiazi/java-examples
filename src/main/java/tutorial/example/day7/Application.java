package tutorial.example.day7;

import java.time.DayOfWeek;

public class Application {

    public static void main(String[] args)
    {
        Snake snake1 = new Snake();

        snake1.setHead("big head");
        snake1.setBody("long body");

        Cat cat1 = new Cat();
        cat1.move();

        Animal animal1 = new Bird();
        Animal animal2 = new Cat();
        Animal animal3 = new Snake();
        Animal animal4 = new Fish();

        AnimalBehavior cat2 = new Cat();

        Character byte1 = new Character();
        byte1.setColor("green");
        byte1.setBody("strange");

        Character byte2 = new Character();
        byte2.setColor("blue");
        byte2.setBody("stranger");

        Character byte3 = new Character();
        byte3.setColor("yellow");
        byte3.setBody("strangest");


        byte1.moveForward();
        byte1.moveForward();
        byte1.moveForward();
        byte1.collectGem();


    }
}

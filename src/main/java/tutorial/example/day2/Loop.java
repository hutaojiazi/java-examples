package tutorial.example.day2;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("here i is equals to " + i);
        }

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i  + " is an even number");
//            } else {
//                System.out.println(i  + " is an odd number");
//            }
//
//        }

        int gameTime = 60;
        int start = 0;
//        while (start < gameTime) {
//            System.out.println("You played " + start + " minutes. You have " + (gameTime - start) + " left.");
//            start = start + 10;
//
//        }
//        System.out.println("game time is over");

        do {
            // code at here will be ran at least once bcz condition is checked after
        } while (start < gameTime);
    }
}

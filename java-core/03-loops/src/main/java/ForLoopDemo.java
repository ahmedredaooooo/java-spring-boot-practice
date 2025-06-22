public class ForLoopDemo {
    public static void main(String[] args) {

        // loop 100 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        // count form 1 to 5
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Counter: " + i);
        }
        // count form 0 to 20 in increments of 5
        for (int i = 0; i <= 20; i += 5) {
            System.out.println("Counter: " + i);
        }

        // count down from 5 to 0
        for (int i = 5; i >= 0; i--) {
            System.out.println("Counter: " + i);
        }
    }
}
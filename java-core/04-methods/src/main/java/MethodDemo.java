public class MethodDemo {

    public static void main(String[] args) {

        // call the method
        // displayGreetings();

        displayGreetings(3);
    }

    static void displayGreetings(int count) {
        for (int i = 1; i <= count; i++) {

            displayGreetings();

            System.out.println();
        }
    }

    // define the method
    static void displayGreetings() {
        System.out.println("Hello World!");
        System.out.println("Welcome to Java!");
        System.out.println("Please make yourself at home.");
    }
}

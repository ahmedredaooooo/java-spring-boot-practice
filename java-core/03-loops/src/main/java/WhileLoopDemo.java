import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Boolean done = false;

        while (!done) {
            System.out.println("Hello World from While Loop");

            System.out.print("Are You Done? Y/N: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("y"))
                done = true;
        }

        done = false;
        do {
            System.out.println("Hello World from Do While Loop");

            System.out.print("Are You Done? Y/N: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("y"))
                done = true;
        } while (!done);


        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gameName = "Number Guessing Game";
        System.out.println(gameName.toUpperCase());

        Random random = new Random();
        int numberOfTrials = 3, start = 1, end = 10, target = random.nextInt(end) + start;
        System.out.println("You habe " + numberOfTrials + " attempts.");

        while (numberOfTrials-- > 0) {

            System.out.print("Guess a number between " + start + " and " + end + ": " );
            int guess = sc.nextInt();

            if (target == guess) {
                System.out.println("Success!!! You guessed the secret number " + guess);
                break;
            }

            System.out.println("Sorry, your guess is incorrect.\n");
            if (numberOfTrials == 0)
                System.out.println("You have run out of attempts. The secret number was " + target + ".");
            else
                System.out.println("You have " + numberOfTrials + " attempt(s) left");
        }
        sc.close();
    }
}

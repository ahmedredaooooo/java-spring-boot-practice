import java.util.Scanner;

public class ConditionalDemoBasicIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minVotingAge = 18;

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Minimum voting age is " + minVotingAge);

        boolean eligible = age >= minVotingAge;
        System.out.println("eligible is " + eligible + '\n');

        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        sc.close();
    }

}
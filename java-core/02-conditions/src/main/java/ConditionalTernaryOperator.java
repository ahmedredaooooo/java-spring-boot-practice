import java.util.Scanner;

public class ConditionalTernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minVotingAge = 18;

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Minimum voting age is " + minVotingAge);

        String message = age >= minVotingAge ?
                  "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(message);
        sc.close();
    }
}

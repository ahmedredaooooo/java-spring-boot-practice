public class ConditionalDemoBasicIfElse {
    public static void main(String[] args) {

        int minVotingAge = 18, age = 15;
        System.out.println("Minimum voting age is " + minVotingAge);

        if (age >= minVotingAge) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
    }
}

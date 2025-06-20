import java.util.Scanner;

public class ConditionalDemoCompoundsAndNested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minClassCount = 2;
        int maxClassCount = 5;

        System.out.print("Enter your class count: ");
        int userCount = sc.nextInt();

        System.out.println("userCount: " + userCount);
        System.out.println("minClassCount: " + minClassCount + "\nmaxClassCount: " + maxClassCount);

        System.out.println();

        if (userCount >= minClassCount && userCount <= maxClassCount) {
            System.out.println("Your class count is in the recommended range");
        } else {
            System.out.println("Your class count is NOT in the recommended range");
        }

    }
}

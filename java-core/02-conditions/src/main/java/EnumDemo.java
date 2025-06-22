import java.util.Scanner;

public class EnumDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ComputerType computerType = null;

        System.out.print("Enter computer type: {SMARTPHONE, TABLET, LAPTOP, DESKTOP}: ");
        String type = sc.nextLine().trim().toUpperCase();

        try {
            computerType = ComputerType.valueOf(type); // convert string to enum
            System.out.println("You selected: " + computerType);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid computer type: " + type);
            System.exit(1);
        } finally {
            sc.close();
        }

        String description = switch (computerType) {
            case ComputerType.SMARTPHONE -> "Smartphone offer computing power in your hand.";
            case ComputerType.TABLET -> "Tablets are lightweight for browsing and light tasks.";
            case ComputerType.LAPTOP -> "Laptops are portable for work on the go.";
            case ComputerType.DESKTOP -> "Desktops excel in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };
        System.out.println(description);
        sc.close();
    }
}

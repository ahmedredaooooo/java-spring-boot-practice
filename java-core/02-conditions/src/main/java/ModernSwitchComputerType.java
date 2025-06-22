import java.util.Scanner;

public class ModernSwitchComputerType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Computer Type: ");
        String computerType = sc.nextLine().toLowerCase();

        // Version 1
        /* switch (computerType)
        {
            case "smartphone" -> System.out.println("Smartphone offer computing power in your hand.");
            case "tablet" -> System.out.println("Tablets are lightweight for browsing and light tasks.");
            case "laptop" -> System.out.println("Laptops are portable for work on the go.");
            case "desktop" -> System.out.println("Desktops excel in gaming and work related tasks.");
            default -> System.out.println("Unknown computer type.");
        }
        */

        // Version 2
        String description = switch (computerType)
        {
            case "smartphone" -> "Smartphone offer computing power in your hand.";
            case "tablet" -> "Tablets are lightweight for browsing and light tasks.";
            case "laptop" -> "Laptops are portable for work on the go.";
            case "desktop" -> "Desktops excel in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };
        System.out.println(description);

        sc.close();
    }
}

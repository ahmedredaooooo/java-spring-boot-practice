import java.util.Locale;
import java.util.Scanner;

public class SwitchComputerType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Computer Type: ");
        String computerType = sc.nextLine().toLowerCase();

        switch (computerType) {
            case "smartphone":
                System.out.println("Smartphone offer computing power in your hand.");
                break;
            case "tablet":
                System.out.println("Tablets are lightweight for browsing and light tasks.");
                break;
            case "laptop":
                System.out.println("Laptops are portable for work on the go.");
                break;
            case "desktop":
                System.out.println("Desktops excel in gaming and work related tasks.");
                break;
            default:
                System.out.println("Unknown computer type.");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class SwitchMonthsAndQuarters {
    public static void main(String[] args) {

        // Months are 1-based: jan = 1, feb = 2, etc ...

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Month: " + month + " is in Quarter: ");

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4");
                break;
            default:
                System.out.println("no Quarter because it's invalid month number");
        }
        sc.close();
    }
}

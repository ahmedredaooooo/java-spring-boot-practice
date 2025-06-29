import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {

    public static void main(String[] args) {

        // prompt user for size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int []data = new int[size];

        // fill array with user value
        System.out.print("Enter the value you want to fill the array with: ");
        int value = sc.nextInt();
        Arrays.fill(data, value);

        System.out.println("The array filled with " + value + " is: " + Arrays.toString(data));

        sc.close();

    }
}

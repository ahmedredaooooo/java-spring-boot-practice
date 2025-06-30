import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {

    public static void main(String[] args) {

        // prompt user for size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int []data = new int[size];

        // read array elements
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            data[i] = sc.nextInt();
        }

        System.out.println("The array before sort" + " is: " + Arrays.toString(data) + '\n');
        Arrays.sort(data);
        System.out.println("The array after sort" + " is: " + Arrays.toString(data));

        sc.close();

    }
}

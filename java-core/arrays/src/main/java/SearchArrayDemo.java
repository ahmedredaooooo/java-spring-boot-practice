import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayDemo {

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
        System.out.println();

        System.out.print("What number do you want to search for? ");
        int searchValue = sc.nextInt();

        // we will search using binary search, so first we need to sort the array
        Arrays.sort(data);

        // search the array
        int result = Arrays.binarySearch(data, searchValue);

        if (result >= 0) {
            System.out.println("The number " + searchValue + " is found at index " + result);
        } else {
            System.out.println("The number " + searchValue + " is not found in the array");
        }

        sc.close();

    }
}

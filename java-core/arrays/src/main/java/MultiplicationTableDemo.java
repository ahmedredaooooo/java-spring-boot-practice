import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt the user to know the size of the table
        System.out.print("Enter the number of rows: ");
        int numberOfRows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int numberOfColumns = sc.nextInt();

        int [][] multiplicationTable = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // printing the table
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

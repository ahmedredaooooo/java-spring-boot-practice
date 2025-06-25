import java.util.Scanner;

public class StudentGradesDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hard coded");
        // initialize the array
        double[] grades = new double[3];

        // assign student grades
        grades[0] = 95.5;
        grades[1] = 87.5;
        grades[2] = 75.5;

        // display the grades
        for (double grade : grades)
            System.out.println(grade);
        System.out.println();

        System.out.println("user input based:- ");

        System.out.print("How many grades will you entre? ");
        int numOfGrades = sc.nextInt();

        grades = new double[numOfGrades];
        for (int i = 0; i < numOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        System.out.println("your grades are:-");
        // display the grades
        for (double grade : grades)
            System.out.println(grade);

        sc.close();
    }
}

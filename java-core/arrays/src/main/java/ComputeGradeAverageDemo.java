import java.util.Scanner;

public class ComputeGradeAverageDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many grades will you entre? ");
        int numOfGrades = sc.nextInt();

        double[] grades = new double[numOfGrades];
        for (int i = 0; i < numOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        System.out.println("your grades are:-");
        // display the grades
        for (double grade : grades)
            System.out.println(grade);

        double gradeAverage = computeGradeAverage(grades);
        System.out.println("Your grade average is: " + gradeAverage);

        sc.close();
    }

    private static double computeGradeAverage(double[] grades) {

        // compute sum of the grades
       double sum = 0;
       for (double grade : grades) {
           sum += grade;
       }

       // compute grade average, based on length of array
        return sum / grades.length;
    }
}

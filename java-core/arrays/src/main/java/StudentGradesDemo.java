public class StudentGradesDemo {

    public static void main(String[] args) {

        // initialize the array
        double[] grades = new double[3];

        // assign student grades
        grades[0] = 95.5;
        grades[1] = 87.5;
        grades[2] = 75.5;

        // display the grades
        for (double grade : grades)
            System.out.println(grade);
    }
}

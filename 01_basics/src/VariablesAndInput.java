import java.util.Scanner;

public class VariablesAndInput {
    public static void printData(int age, double weight, char gender, boolean married, String name) {
        System.out.println("name = " + name + ", age = " + age + ", weight = " + weight + ", gender = " + gender + ", married = " + married);
    }

    public static void main(String[] args) {
        int age = 22;
        double weight = 150;
        char gender = 'M';
        boolean married = false;
        String name = "Ahmed";
        System.out.println("default values:-");
        printData(age, weight, gender, married, name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data");
        System.out.print("enter your name");
        name = sc.nextLine();
        System.out.print("enter your age: ");
        age = sc.nextInt();
        System.out.print("enter your weight: ");
        weight = sc.nextDouble();
        System.out.print("enter your gender: ");
        gender = sc.next().charAt(0);
        System.out.print("enter your married (true/false): ");
        married = sc.nextBoolean();
        sc.close();

        System.out.println("your values:-");
        printData(age, weight, gender, married, name);
    }
}
public class RecursionDemo {

    public static void main(String[] args) {

        int value = 5;
        int result = factorial(value);

        System.out.println("Factorial of " + value + " is " + result);
    }

    // define method
    static int factorial(int n) {

        // base case: 0! = 1
        if (n == 0) return 1;

        // recursive case: num! = num * (num - 1)!
        return n * factorial(n - 1);
    }
}

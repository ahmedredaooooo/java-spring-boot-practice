public class MethodReturnDataDemo {
    public static void main(String[] args) {

        int value = 9;

        int sum = summation_O_Of_num(value);
        System.out.println("Summation of " + value + " is " + sum);

        sum = summation_O_Of_one(value);
        System.out.println("Summation of " + value + " is " + sum);
    }

    static int summation_O_Of_num(int num) {

        int result = 0;
        for (int i = 1; i <= num; i++)
            result += i;

        return result;
    }


    static int summation_O_Of_one(int num) {
        return num * (num + 1) >> 1;
    }
}

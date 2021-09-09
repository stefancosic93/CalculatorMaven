public class Calculator {
    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int sub (int num1, int num2) {
        return num1 - num2;
    }

    public static int mul (int num1, int num2) {
        return num1 * num2;
    }

    public static double div (double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("You cannot divide by 0");
        }
        return num1 / num2;
    }
}

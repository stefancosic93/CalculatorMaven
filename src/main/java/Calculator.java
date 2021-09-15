public class Calculator {

    public static void main (String[] args) {
        System.out.println("Started the program!");
        int a = add(1, 5);
        System.out.println("Result: " + a);
    }
    public static int add (int num1, int num2) {
        System.out.println("Called ADD function with: " + num1 + " and " + num2);
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
